package FamTree.model.ft;

import java.util.Comparator;

public class FamilyTreeComparatorByBirthDate<T extends LifeFormGroup<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {return o1.getBirthDate().compareTo(o2.getBirthDate());}
}
