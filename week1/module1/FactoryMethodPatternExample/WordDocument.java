package week1.module1.FactoryMethodPatternExample;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }
}
