 public class chiper_transposisi {

     public static void main(String args[]) {
         int key;
         String message;
         String encryptedMessage;
// Letters in the x-axis
         int x = 0;
// Letters in the y-axis
         int y = 0;
         key = 4;
         message = "GALIHSETIADI";
         encryptedMessage = "";
         System.out.println("--------------------------");
         System.out.println("Plainteks : " + message);
         System.out.println("--------------------------");

// To set the temp as [x][y]
         char temp[][] = new char[key][message.length()];
         char msg[] = message.toCharArray();
// To convert the message into an array of char
         for (int i = 0; i < msg.length; i++) {
             temp[x][y] = msg[i];
             if (x == (key - 1)) {
                 x = 0;
                 y = y + 1;
             } // Close if
             else {
                 x++;
             }
         } // Close for loop
// To sort the key
         System.out.println("Untuk mengenkripsi pesan, plainteks ditulis secara horizontal dengan lebar kolom tetap, misal\n" +
                 "selebar 4 karakter (kunci=4) :");
         for (int j = 0; j < y; j++) {
             for (int i = 0; i < key; i++) {
                 System.out.print(temp[i][j]);

             }
             System.out.println();
         }
         System.out.println("");
         System.out.println("Chiperteks nya dibaca secara vertical menjadi :");
         for (int i = 0; i < key; i++) {
             System.out.print(temp[i]);
         }
         System.out.println();
         System.out.println("---------------------------------");
         System.out.println("Sedangkan untuk mendeskripsikannya kita membagi Panjang alphabet dengan kunci sehingga\n" +
                 "12 dibagi 4 sama dengan 3,\n" +
                 "Kemudian menulis chiperteksnya dalam baris-baris selebar 3 karakter menjadi:");
         for (int j = 0; j < key; j++) {
             for (int i = 0; i < y; i++) {
                 System.out.print(temp[j][i]);
             }
             System.out.println();
         }
         System.out.println("---------------------------------");
         System.out.println("Dengan membaca setiap kolom maka diperoleh pesan semula yaitu :");
         for (int j = 0; j < y; j++) {
             for (int i = 0; i < key; i++) {
                 System.out.print(temp[i][j]);
             }
         }
     }
 }
