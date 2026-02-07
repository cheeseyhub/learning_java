public class TwoGen<T, V> {
  T obj1;
  V obj2;

  TwoGen(T o1, V o2) {
    obj1 = o1;
    obj2 = o2;
  }

  void showTypes() {
    System.out.println("Type of T is " + obj1.getClass().getName());
    System.out.println("Type of V is " + obj2.getClass().getName());

  }

  T getobj() {
    return obj1;
  }

  V getobj2() {
    return obj2;
  }
}
