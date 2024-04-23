public class APLine
{
  private int a, b, c;
  public APLine(int d, int e, int f){
    a = d;
    b = e;
    c = f;
  }
  public double getSlope(){
    return (-(double)a/b);
  }
  public boolean isOnLine(int x, int y){
    if (((a * x) + (b * y) + c) == 0){
      return true;
    }
    return false;
  }
  
}
