// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class rectangle {
    float longueur,largeur;
    public rectangle(float lo, float la){
        this.longueur=lo;
        this.largeur= la;
    }
    public float   perimetre(){
        return 2 * (longueur+largeur );
    }
    public  double diagonal(){
        return longueur+largeur;
    }
    public float doubler() {
        return  longueur*2;

    } public float doublerlar() {
        return  largeur*2;
    }a

    public static void main(String[] args) {
        rectangle r1=new rectangle(100,200);
        System.out.println("le perimetre est"+r1.perimetre());
        System.out.println("le diagonal est"+r1.diagonal());
        System.out.println("longueur double est "+r1.doubler());
        System.out.println("largueur double est "+r1.doublerlar());
    }

}

