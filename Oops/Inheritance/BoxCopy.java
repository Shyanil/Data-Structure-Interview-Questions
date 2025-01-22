public class BoxCopy extends  Box{
    String boxName;

    public BoxCopy(String boxName) {  // if i pass String this call
        this.boxName = boxName;
    }


    public BoxCopy() {
        /*
      its just simple i created this constructor because its help child class to extends
        The child class needs the base class constructor to properly initialize
        inherited attributes and ensure the parent class is set up correctly before adding its own behavior.
*/
    }

    /*  Its is a copy of constructor  */
    /* Here super keywords take the value of main box class Another constructor */
    public BoxCopy(BoxCopy other) {
        super(other);
    boxName = other.boxName;
    }

    /* all three parameters passed from parent class its check that constructor and
         extra take child class parameter in argument and
         child class using super its call the data from Parent class */
    public BoxCopy(int width, int height, int length, String boxName) {
    //  super(width, height, length);  /* used to initialize the value present in parent class
        // if i command out super then its call default constructor with no parameters of super class */
        this.boxName = boxName;
/*
                You call the parameterized constructor in BoxCopy to initialize specific dimensions,
                while the no-argument constructor sets default values for cases where specific dimensions aren't needed.
         using super keyword, we able to access the parent class variables or constructor variables
        */
        super.height = 40;
        /*
         this also do the same thing but here this keyword first checks for subclass then if not
          found, then its goes for parent class
         if the boxName parameters are in parent as well the this .boxName only call child class but super.boxName call parent
        */

    }

    @Override
    public String toString() {
        return "BoxCopy{" +
                "boxName='" + boxName + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
