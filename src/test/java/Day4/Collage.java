package Day4;

public class Collage {


    protected String city = "Pune";
    public String pin = "525156";
    private String card = "48545684525";
        float tep = 55.56f;




    public static void main(String[] args) {

        Collage col =new Collage();
        col.admission();
        col.arts();
        col.craft();
        col.trainning();

    }

    public void admission(){

        System.out.println("Public Method");

    }
    private void trainning(){

        System.out.println("Private Method");

    }

    protected void arts(){

        System.out.println("Protected Method");

    }

    void craft(){
        System.out.println("Default method");
    }

}
