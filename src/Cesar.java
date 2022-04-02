public class Cesar {
/** parametreli metodun classı**/



    /** Parametreli metot **/
    /** Parametre olarak şifrelenecek mesajı ve key'i alır**/
public static String CesarEncrypt(String message, String key){


    /** Şifrelemek için 26 elemanlı alfabe kullanıyoruz**/
    String alphabet = "abcdefghijklmnopqrstuvwxyz";


    StringBuilder encryptedMessage = new StringBuilder(message);
    /** Girilen mesajı encryptedMessage ile tuttuk**/


    int keyIndex= 0;
    /** Şifreleyecek olan key ifadesinin harf sayısını şifrelenecek mesajın
     * harf sayısı kadar tutmamız gerekiyor. Bu kısımda belirlediğimiz key kaç
     * defa tekrar edecek onu buluyoruz**/


    for ( int i=1; i<message.length();i++){ /** Mesaj uzunluğu kadar key tekrar edecek**/
        char letter = message.charAt(i-1);

        if ( letter != ' '){
            char keyLetter = key.charAt(keyIndex);/** Key 'in keyIndex. karakterini keyLetter'a atıyor**/
                                                  /** Bu durumda "k" harfini keyLetter'a atar**/

             int keyValue = alphabet.indexOf(letter);


        }
    }








}

}
