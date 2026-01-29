public class Box {

    double width;
    double height;
    double depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(int w, int h,int d){

        width = w;
        height = h;
        depth = d;
    }
    Box(double len)
    {
        width = height = depth = len;
    }

    void times(Box a){
        a.height *=100;
        a.width *=300;
        a.depth *=900;
    }
}
