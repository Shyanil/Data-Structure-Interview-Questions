public class Box {
    int width;
    int height;
    int length;

    public Box(){   // in object creation if pass no value this constructor call
        this.width = 10;
        this.height = 20;
        this.length = this.width + this.height;
    }

    public Box(int width, int height, int length) {   // in object creation if pass three value this constructor call
        this.width = width;
        this.height = height;
        this.length = length;

        // this constructor helper for any child class if we pass all there value in parameter
    }

    public  Box(int totalValue){   // in object creation if pass one value this constructor call
        this.width = totalValue * 10;
        this.height = totalValue * 20;
        this.length = this.width + this.height;
    }

    public Box(Box other){  // in object creation if pass any other reference variable in  value this constructor call
        // its copy the value
        this.width = other.width;
        this.height = other.height;
        this.length = other.length;

   }
}
