public class caesar_cipher {
        public static void main(String[] args) {
            String str = "UNIVERSITAS STIKUBANK SEMARANG";
            System.out.println("----------------------------------");
            System.out.println("Plainteks : " + str);
            System.out.println("Chiperteks : " + caesar_cipher.encode( str, 4 ));
            System.out.println("----------------------------------");
        }
        public static String encode(String enc, int offset) {
            offset = offset % 26 + 26;
            StringBuilder encoded = new StringBuilder();
            for (char i : enc.toCharArray()) {
                if (Character.isLetter(i)) {
                    if (Character.isUpperCase(i)) {
                        encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                    } else {
                        encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                    }
                } else {
                    encoded.append(i);
                }
            }
            return encoded.toString();
        }
    }
