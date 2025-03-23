public class Ponto {
    private double x,y;

    public Ponto(double x, double y){

        setX(x);
        setY(y);
    }
    public double dist(Ponto p){
        double dx = x - p.x;
        double dy = y - p.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
       if(x < 0){
           System.out.println("iv");
           System.exit(0);
       }
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if(y < 0){
            System.out.println("iv");
            System.exit(0);
        }
        this.y = y;
    }
}
