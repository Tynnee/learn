//Daniel Meyer(565281) GDP Praktikum Aufgaben 2.2
//Sorry für "unsauberen" code ist 4 uhr Nachts ;)

//Kurze Frage:Gibt es eine einfacher Methode als neue mehrdemensionale Arrays zu bauen die
//man dann in Schleifen mit den "alten" Arrays der Zahlen befüllt, um die nebeneinander
//stehen zu haben? Wenn ja wäre ich dankbar für ein Beispielcode hab nach langem googeln nichts gescheites gefunden.....

class Banner{
  public static void drucken(String[][] s){
    for (int i=0; i<s.length; ++i) {
      for (int j=0; j<s[i].length; ++j) {
        System.out.print(s[i][j]);
        }
      System.out.println();
    }
  }
  public static void main(String[] args){
    String zahl = args[0];
    String matrix0[][] =   { {" "," ","#","#","#"," "," "," "},
                             {" ","#"," "," "," ","#"," "," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" ","#"," "," "," ","#"," "," "},
                             {" "," ","#","#","#"," "," "," "},
                             {" "," "," "," "," "," "," "," "} };

    String matrix1[][] =   { {" "," "," ","#"," "," "," "," "},
                             {" "," ","#","#"," "," "," "," "},
                             {" ","#"," ","#"," "," "," "," "},
                             {" "," "," ","#"," "," "," "," "},
                             {" "," "," ","#"," "," "," "," "},
                             {" "," "," ","#"," "," "," "," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," "," "," "} };


    String matrix2[][] =   { {" ","#","#","#","#","#"," "," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" "," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {"#"," "," "," "," "," "," "," "},
                             {"#"," "," "," "," "," "," "," "},
                             {"#","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," "," "," "} };

    String matrix3[][] =   { {" ","#","#","#","#","#"," "," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" "," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," "," "," "} };

    String matrix4[][] =   { {"#"," "," "," "," "," "," "," "},
                             {"#"," "," "," "," ","#"," "," "},
                             {"#"," "," "," "," ","#"," "," "},
                             {"#"," "," "," "," ","#"," "," "},
                             {"#","#","#","#","#","#","#"," "},
                             {" "," "," "," "," ","#"," "," "},
                             {" "," "," "," "," ","#"," "," "},
                             {" "," "," "," "," "," "," "," "} };

    String matrix5[][] =   { {"#","#","#","#","#","#","#"," "},
                             {"#"," "," "," "," "," "," "," "},
                             {"#"," "," "," "," "," "," "," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," "," "," "} };

    String matrix6[][] =   { {" ","#","#","#","#","#"," "," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," "," "," "},
                             {"#","#","#","#","#","#"," "," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," "," "," "} };

    String matrix7[][] =   { {"#","#","#","#","#","#","#"," "},
                             {"#"," "," "," "," ","#"," "," "},
                             {" "," "," "," ","#"," "," "," "},
                             {" "," "," ","#"," "," "," "," "},
                             {" "," ","#"," "," "," "," "," "},
                             {" "," ","#"," "," "," "," "," "},
                             {" "," ","#"," "," "," "," "," "},
                             {" "," "," "," "," "," "," "," "} };

    String matrix8[][] =   { {" ","#","#","#","#","#"," "," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," "," "," "} };

    String matrix9[][] =   { {" ","#","#","#","#","#"," "," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," ","#"," "},
                             {"#"," "," "," "," "," ","#"," "},
                             {" ","#","#","#","#","#"," "," "},
                             {" "," "," "," "," "," "," "," "} };

    char[] zahlenListe = zahl.toCharArray();
    char[] vergleichsListe = {'0','1','2','3','4','5','6','7','8','9'};
    int zaehler = 0;
    for(int l=0;l<10;l++){
      for(int d=0;d<10;d++){
          if(vergleichsListe[d]==zahlenListe[l]){
            zaehler++;
          }
      }
    }
    if(zaehler!=10){
      System.out.println("Falsch Eingabe, bitte die ersten 10 Ziffern natuerliche Zahlen eingeben.");
      System.exit(0);
    }
    for (int k=0;k<zahlenListe.length;k++){
        if (zahlenListe[k] == '0'){
          drucken(matrix0);
          }
        if (zahlenListe[k] == '1'){
          drucken(matrix1);
          }
        if (zahlenListe[k] == '2'){
          drucken(matrix2);
          }
        if (zahlenListe[k] == '3'){
          drucken(matrix3);
          }
        if (zahlenListe[k] == '4'){
          drucken(matrix4);
          }
        if (zahlenListe[k] == '5'){
          drucken(matrix5);
          }
        if (zahlenListe[k] == '6'){
          drucken(matrix6);
          }
        if (zahlenListe[k] == '7'){
          drucken(matrix7);
          }
        if (zahlenListe[k] == '8'){
          drucken(matrix8);
          }
        if (zahlenListe[k] == '9'){
          drucken(matrix9);
          }
        if (k==9){
          k=zahlenListe.length;
        }
    }
}
}