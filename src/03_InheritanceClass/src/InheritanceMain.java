public class InheritanceMain {
    public static void main(String[] args) {
        System.out.println("Inheritance & it's types in Java");

        // Single Inheritance
        SingleInheritance_B si1= new SingleInheritance_B();
        si1.displaySingleInheritance_B();
        si1.displaySingleInheritance_A();

        // Hierarchical Inheritance
        HierarchicalInheritance_Child1 hi_c1= new HierarchicalInheritance_Child1();
        HierarchicalInheritance_Child2 hi_c2 = new HierarchicalInheritance_Child2();
        hi_c1.displayHierarchicalInheritance_Child1();;
        hi_c1.displayHierarchicalInheritance_Parent();
        hi_c2.displayHierarchicalInheritance_Child2();
        hi_c2.displayHierarchicalInheritance_Parent();

        // Multilevel Inheritance
        MultilevelInheritance_L1 mi_l1 = new MultilevelInheritance_L1();
        MultilevelInheritance_L2 mi_l2 = new MultilevelInheritance_L2();
        MultilevelInheritance_L3 mi_l3 = new MultilevelInheritance_L3();
        mi_l1.displayMultilevelInheritance_L1();
        mi_l2.displayMultilevelInheritance_L2();
        mi_l2.displayMultilevelInheritance_L1();
        mi_l3.displayMultilevelInheritance_L3();
        mi_l3.displayMultilevelInheritance_L2();
        mi_l3.displayMultilevelInheritance_L1();
    }
}
