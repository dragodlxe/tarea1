public class tarea {
    public static void main(String[] args){
        //region Parte 1 llamado
        System.out.println(suma(1,2,3));
        //endregion

        //region Parte 2 llamado
        coche micarro = new coche();
        micarro.incrementar_puertas();
        System.out.println(micarro.puertas);
        //endregion
    }
    //region Parte 1 definicion
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
    //endregion
}
//Parte 2 definicion
class coche{
    public int puertas;

    public void incrementar_puertas(){
        this.puertas++;
    }
}
