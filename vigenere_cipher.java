
public class vigenere_cipher
{
    static String generateKey(String str, String key)
    {
        int x = str.length();

        for (int i = 0; ; i++)
        {
            if (x == i)
                i = 0;
            if (key.length() == str.length())
                break;
            key+=(key.charAt(i));
        }
        return key;
    }

    static String cipherText(String str, String key)
    {
        String cipher_text="";

        for (int i = 0; i < str.length(); i++)
        {
            // converting in range 0-25
            int x = (str.charAt(i) + key.charAt(i)) %26;

            // convert into alphabets(ASCII)
            x += 'A';

            cipher_text+=(char)(x);
        }
        return cipher_text;
    }

    static String originalText(String cipher_text, String key)
    {
        String orig_text="";

        for (int i = 0 ; i < cipher_text.length() &&
                i < key.length(); i++)
        {
            // converting in range 0-25
            int x = (cipher_text.charAt(i) -
                    key.charAt(i) + 26) %26;
            // convert into alphabets(ASCII)
            x += 'A';
            orig_text+=(char)(x);
        }
        return orig_text;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "SEMARANGKOTATERCINTAKU";
        String keyword = "GALIHGALIHGALIHGALIHGA";
        String key = generateKey(str, keyword);
        String cipher_text = cipherText(str, key);
        System.out.println("-----------------------------------------");
        System.out.println("Plainteks  : " + originalText(cipher_text, key));
        System.out.println("Key        : " + keyword);
        System.out.println("Ciphertext : " + cipher_text);
        System.out.println("Decrypt    : " + originalText(cipher_text, key));
    }
} 