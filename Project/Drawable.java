public interface Drawable {
    default void draw(){
        system.out.println("Drawing a shape");
    }
}