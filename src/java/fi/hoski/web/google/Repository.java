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
package fi.hoski.web.google;

/**
 * @deprecated Moved to HoskiLib fi.hoski.datastore.Repository
 * @author Timo Vesalainen
 */
public interface Repository {

  /*
   * Kind names
   */
  public static final String MESSAGES = "Messages";
  public static final String JASENET = "Jasenet";
  public static final String JASENKOODIT = "Jasenkoodit";
  public static final String VENEET = "Veneet";
  public static final String LAITURIPAIKKATIEDOT = "Laituripaikkatiedot";
  public static final String LAITURIPAIKAT = "Laituripaikat";
  public static final String LAITURIT = "Laiturit";
  public static final String VARTIOVUOROTIEDOT = "Vartiovuorotiedot";
  public static final String VARTIOVUOROT = "Vartiovuorot";
  public static final String CREDENTIALS = "Credentials";

  /**
   * Key of the latest activation.
   *
   * Latest activation is the last time the user was activated in the
   * form of java.util.Date object. Used to restrict the number of
   * activations per timespan.
   */
  public static final String LATEST_ACTIVATION = "latestActivation";
  /**
   * On-time activation key the user can use to log-in from e-mail.
   */
  public static final String ACTIVATION_KEY = "activationKey";
  /**
   * Key of the user's password digest.
   */
  public static final String PASSWORD = "password";


  /*
   * Following fields are available from user Map. Display names for these fields
   * are available in ResourceBundle fi/hoski/datastore/labels with the same name.
   */
  public static final String JASENET_AMMATTI = "Jasenet.Ammatti";		// String
  public static final String JASENET_BOKSINO = "Jasenet.BoksiNo";		// double
  public static final String JASENET_EMAIL = "Jasenet.Email";		// String
  public static final String JASENET_ETUNIMI = "Jasenet.Etunimi";		// String
  public static final String JASENET_JASENNO = "Jasenet.JasenNo";		// int
  public static final String JASENET_JASENKOODI = "Jasenet.Jasenkoodi";		// int
  public static final String JASENET_MAA = "Jasenet.Maa";		// String
  public static final String JASENET_MAATUNNUS = "Jasenet.Maatunnus";		// String
  public static final String JASENET_MOBILE = "Jasenet.Mobile";		// String
  public static final String JASENET_OSOITE = "Jasenet.Osoite";		// String
  public static final String JASENET_PELTKAAPPINO = "Jasenet.PeltkaappiNo";		// int
  public static final String JASENET_POSTINUMERO = "Jasenet.Postinumero";		// String
  public static final String JASENET_POSTITOIMIPAIKKA = "Jasenet.Postitoimipaikka";		// String
  public static final String JASENET_PUHELIN = "Jasenet.Puhelin";		// String
  public static final String JASENET_PUHELINTYO = "Jasenet.Puhelintyo";		// String
  public static final String JASENET_SUKUNIMI = "Jasenet.Sukunimi";		// String
  public static final String JASENET_SUKUPUOLI = "Jasenet.Sukupuoli";		// String
  public static final String JASENET_YRITYS = "Jasenet.Yritys";		// String
  public static final String JASENKOODIT_JASENKOODI = "Jasenkoodit.Jasenkoodi";		// int
  public static final String JASENKOODIT_NIMI = "Jasenkoodit.Nimi";		// String
  public static final String LAITURIPAIKAT_AISA = "Laituripaikat.Aisa";		// boolean
  public static final String LAITURIPAIKAT_ID = "Laituripaikat.ID";		// int
  public static final String LAITURIPAIKAT_LAITURI = "Laituripaikat.Laituri";		// int
  public static final String LAITURIPAIKAT_LEVEYS = "Laituripaikat.Leveys";		// double
  public static final String LAITURIPAIKAT_PAIKKA = "Laituripaikat.Paikka";		// int
  public static final String LAITURIPAIKAT_PITUUS = "Laituripaikat.Pituus";		// double
  public static final String LAITURIPAIKAT_SYVAYS = "Laituripaikat.Syvays";		// double
  public static final String LAITURIPAIKKATIEDOT_ID = "Laituripaikkatiedot.ID";		// int
  public static final String LAITURIPAIKKATIEDOT_LAITURIID = "Laituripaikkatiedot.LaituriID";		// int
  public static final String LAITURIPAIKKATIEDOT_VAPAAALKU = "Laituripaikkatiedot.VapaaAlku";		// Date
  public static final String LAITURIPAIKKATIEDOT_VAPAALOPPU = "Laituripaikkatiedot.VapaaLoppu";		// Date
  public static final String LAITURIPAIKKATIEDOT_VENEID = "Laituripaikkatiedot.VeneID";		// int
  public static final String LAITURIT_ID = "Laiturit.ID";		// int
  public static final String LAITURIT_TUNNUS = "Laiturit.Tunnus";		// String
  public static final String VARTIOVUOROT_ALKAA = "Vartiovuorot.Alkaa";		// Date
  public static final String VARTIOVUOROT_LOPPUU = "Vartiovuorot.Loppuu";		// Date
  public static final String VARTIOVUOROT_PALKAA = "Vartiovuorot.PAlkaa";		// Date
  public static final String VARTIOVUOROT_PLOPPUU = "Vartiovuorot.PLoppuu";		// Date
  public static final String VARTIOVUOROT_VUORONO = "Vartiovuorot.VuoroNo";		// int
  public static final String VARTIOVUOROTIEDOT_JASENNO = "Vartiovuorotiedot.JasenNo";		// int
  public static final String VARTIOVUOROTIEDOT_PAIVA = "Vartiovuorotiedot.Paiva";		// Date
  public static final String VARTIOVUOROTIEDOT_VUOROID = "Vartiovuorotiedot.VuoroID";		// int
  public static final String VARTIOVUOROTIEDOT_VUORONO = "Vartiovuorotiedot.VuoroNo";		// int
  public static final String VENEET_BOKSINO = "Veneet.BoksiNo";		// double
  public static final String VENEET_HENKILOT = "Veneet.Henkilot";		// int
  public static final String VENEET_KAAPINNO = "Veneet.KaapinNo";		// double
  public static final String VENEET_KAASU = "Veneet.Kaasu";		// boolean
  public static final String VENEET_KANNENVARI = "Veneet.Kannenvari";		// int
  public static final String VENEET_KORKEUS = "Veneet.Korkeus";		// double
  public static final String VENEET_LEVEYS = "Veneet.Leveys";		// double
  public static final String VENEET_LUOKKA = "Veneet.Luokka";		// int
  public static final String VENEET_MAKUUPAIKAT = "Veneet.Makuupaikat";		// int
  public static final String VENEET_MALLI = "Veneet.Malli";		// String
  public static final String VENEET_MERKKI = "Veneet.Merkki";		// String
  public static final String VENEET_MVREKNUMERO = "Veneet.MvRekNumero";		// int
  public static final String VENEET_MVREKTUNNUS = "Veneet.MvRekTunnus";		// String
  public static final String VENEET_NIMI = "Veneet.Nimi";		// String
  public static final String VENEET_OMISTAJA = "Veneet.Omistaja";		// int
  public static final String VENEET_PAINO = "Veneet.Paino";		// double
  public static final String VENEET_PITUUS = "Veneet.Pituus";		// double
  public static final String VENEET_PURJENUMERO = "Veneet.Purjenumero";		// int
  public static final String VENEET_PURJETUNNUS = "Veneet.Purjetunnus";		// String
  public static final String VENEET_RAKAINE = "Veneet.RakAine";		// int
  public static final String VENEET_RAKVUOSI = "Veneet.RakVuosi";		// int
  public static final String VENEET_RAKPAIKKA = "Veneet.Rakpaikka";		// String
  public static final String VENEET_RUNGONNUMERO = "Veneet.Rungonnumero";		// String
  public static final String VENEET_RUNGONVARI = "Veneet.Rungonvari";		// int
  public static final String VENEET_SEPTI = "Veneet.Septi";		// boolean
  public static final String VENEET_SUUNNITTELIJA = "Veneet.Suunnittelija";		// String
  public static final String VENEET_TALVIPAIKKANO = "Veneet.TalvipaikkaNo";		// int
  public static final String VENEET_TRAILERI = "Veneet.Traileri";		// String
  public static final String VENEET_TYYPPI = "Veneet.Tyyppi";		// String
  public static final String VENEET_VALMISTAJA = "Veneet.Valmistaja";		// String
  public static final String VENEET_VALMISTENUMERO = "Veneet.Valmistenumero";		// String
  public static final String VENEET_VENEID = "Veneet.VeneID";		// int
  public static final String VENEET_VENEPUKKI = "Veneet.VenePukki";		// int
  public static final String VENEET_VENEPAIKANNO = "Veneet.VenepaikanNo";		// int
  public static final String VENEET_VESILINJA = "Veneet.Vesilinja";		// double
  public static final String VENELUOKAT_LUOKKA = "Veneluokat.Luokka";		// String
  public static final String VENELUOKAT_LUOKKAID = "Veneluokat.LuokkaID";		// int
  public static final String VENETYYPPIT_TYYPPI = "Venetyyppit.Tyyppi";		// String
  public static final String VENETYYPPIT_TYYPPIID = "Venetyyppit.TyyppiID";		// String
  public static final String[] FIELDS = new String[]{
    JASENET_AMMATTI,
    JASENET_BOKSINO,
    JASENET_EMAIL,
    JASENET_ETUNIMI,
    JASENET_JASENNO,
    JASENET_JASENKOODI,
    JASENET_MAA,
    JASENET_MAATUNNUS,
    JASENET_MOBILE,
    JASENET_OSOITE,
    JASENET_PELTKAAPPINO,
    JASENET_POSTINUMERO,
    JASENET_POSTITOIMIPAIKKA,
    JASENET_PUHELIN,
    JASENET_PUHELINTYO,
    JASENET_SUKUNIMI,
    JASENET_SUKUPUOLI,
    JASENET_YRITYS,
    JASENKOODIT_JASENKOODI,
    JASENKOODIT_NIMI,
    LAITURIPAIKAT_AISA,
    LAITURIPAIKAT_ID,
    LAITURIPAIKAT_LAITURI,
    LAITURIPAIKAT_LEVEYS,
    LAITURIPAIKAT_PAIKKA,
    LAITURIPAIKAT_PITUUS,
    LAITURIPAIKAT_SYVAYS,
    LAITURIPAIKKATIEDOT_ID,
    LAITURIPAIKKATIEDOT_LAITURIID,
    LAITURIPAIKKATIEDOT_VAPAAALKU,
    LAITURIPAIKKATIEDOT_VAPAALOPPU,
    LAITURIPAIKKATIEDOT_VENEID,
    LAITURIT_ID,
    LAITURIT_TUNNUS,
    VARTIOVUOROT_ALKAA,
    VARTIOVUOROT_LOPPUU,
    VARTIOVUOROT_PALKAA,
    VARTIOVUOROT_PLOPPUU,
    VARTIOVUOROT_VUORONO,
    VARTIOVUOROTIEDOT_JASENNO,
    VARTIOVUOROTIEDOT_PAIVA,
    VARTIOVUOROTIEDOT_VUOROID,
    VARTIOVUOROTIEDOT_VUORONO,
    VENEET_BOKSINO,
    VENEET_HENKILOT,
    VENEET_KAAPINNO,
    VENEET_KAASU,
    VENEET_KANNENVARI,
    VENEET_KORKEUS,
    VENEET_LEVEYS,
    VENEET_LUOKKA,
    VENEET_MAKUUPAIKAT,
    VENEET_MALLI,
    VENEET_MERKKI,
    VENEET_MVREKNUMERO,
    VENEET_MVREKTUNNUS,
    VENEET_NIMI,
    VENEET_OMISTAJA,
    VENEET_PAINO,
    VENEET_PITUUS,
    VENEET_PURJENUMERO,
    VENEET_PURJETUNNUS,
    VENEET_RAKAINE,
    VENEET_RAKVUOSI,
    VENEET_RAKPAIKKA,
    VENEET_RUNGONNUMERO,
    VENEET_RUNGONVARI,
    VENEET_SEPTI,
    VENEET_SUUNNITTELIJA,
    VENEET_TALVIPAIKKANO,
    VENEET_TRAILERI,
    VENEET_TYYPPI,
    VENEET_VALMISTAJA,
    VENEET_VALMISTENUMERO,
    VENEET_VENEID,
    VENEET_VENEPUKKI,
    VENEET_VENEPAIKANNO,
    VENEET_VESILINJA,
    VENELUOKAT_LUOKKA,
    VENELUOKAT_LUOKKAID,
    VENETYYPPIT_TYYPPI,
    VENETYYPPIT_TYYPPIID
  };
}
