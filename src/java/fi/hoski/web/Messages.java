/*
 * Copyright (C) 2012 Helsingfors Segelklubb ry
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package fi.hoski.web;

import com.google.appengine.api.datastore.*;
import fi.hoski.web.google.Repository;
import java.util.Collections;
import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Messages is a ResourceBundle implementation, where properties are stored in
 * datastore. Each Message derived class needs one entity, which is used as a
 * storage for properties. If Message derived class name is
 * fi.hoski.web.Messages_en, it needs one entity with kind = "Messages" and name
 * = "fi.hoski.web.Messages_en"
 *
 * @author Timo Vesalainen
 * @deprecated 
 */
public class Messages extends ResourceBundle implements Repository {

  private Entity entity;

  public Messages() throws EntityNotFoundException {
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    Key key = KeyFactory.createKey(MESSAGES, getClass().getName());
    entity = datastore.get(key);
  }

  @Override
  protected Object handleGetObject(String key) {
    Object ob = entity.getProperty(key);
    if (ob instanceof Text) {
      Text text = (Text) ob;
      return text.getValue();
    } else {
      return entity.getProperty(key);
    }
  }

  @Override
  public Enumeration<String> getKeys() {
    return Collections.enumeration(entity.getProperties().keySet());
  }
}
