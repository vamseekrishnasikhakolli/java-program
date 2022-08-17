class triangle
  {
    int a;
    
    int b;
    int c;
    triangle()
    {
      a=1;
      b=2;
      c=3;
    }
      double Area(){
    double  s=(a+b+c)/2;
        double e=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return e;
      
    }
      double perimeter()
    {
      double p=(a+b+c) ;
      return b;
    
    }
    public static void main(String args[])
    {
      triangle t=new triangle();
      System.out.println(t.Area());
      System.out.println(t.perimeter());
    }
  }