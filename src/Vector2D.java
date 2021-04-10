public class Vector2D {
    private float x;
    private float y;

    float getX() {return x;}
    float getY() {return y;}

    void setX(float newx) {x=newx;}
    void setY(float newy) {y=newy;}

    public Vector2D add(Vector2D other) {
        Vector2D result = new Vector2D();
        result.setX(x+other.getX());
        result.setY(y+other.getY());
        return result;
    }

    public float scalarProduct(Vector2D other) {
        return x * other.getX() + y * other.y;
    }

    public float magnitude() {
        return (float)(Math.sqrt((double)(x * x + y * y )));
    }

    public Vector2D normalise() {
        float size = this.magnitude();
        Vector2D normalised = new Vector2D();
        normalised.setX(x/size);
        normalised.setY(y/size);
        return normalised;

    }
}
