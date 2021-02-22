class Pain {

  String languages;

  // constructor accepting single value
  Pain(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Pain obj1 = new Pain("Java");
    // obj1.Main("java");
    Pain obj2 = new Pain("Python");
    Pain obj3 = new Pain("C");
  }
}