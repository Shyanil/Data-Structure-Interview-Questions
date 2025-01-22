public class Daughter extends Parent {

    @Override
    public void Career() {
        // TODO Auto-generated method stub
        System.out.println("I am software engineer");
    }

    Daughter(int age){
        super(age);
    }
    

      // overriding the parent class normal method 
      @Override
      void normalMethod() {
          // TODO Auto-generated method stub
          super.normalMethod();
      }
}
