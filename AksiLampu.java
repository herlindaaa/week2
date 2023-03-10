public class AksiLampu {
    public static void main(String[] args){
        Lampu lampu1 = new Lampu();
        lampu1.nyalakanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);

        lampu1.matikanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
    }
}
