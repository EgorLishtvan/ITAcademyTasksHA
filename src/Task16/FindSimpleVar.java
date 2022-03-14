package Task16;

public class FindSimpleVar {
    public void calculate(){
        boolean b=true;
        for (int V=50;V<71;V++){
            for (int i=2;i<V;i++){
                if (V%i==0){
                    b=false;
                    break;
                }
            }
            if (b){
                System.out.println(V);
            }
                else b=true;
        }
    }
}
