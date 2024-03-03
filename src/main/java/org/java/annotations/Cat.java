package org.java.annotations;
@VeryImportant /*my custom 🧩 Annotation 📌*/
public class Cat {
    @FieldAnnotation()
    public String catName;

    public Cat(String ctaName) {
        this.catName=ctaName;
    }
    @RunImmediately(times=5,params={},nums=9.5)
    public void meow(){
        System.out.println("Meow !😽");
    }
    public void eat(){
        System.out.println("Treats");
    }

}

