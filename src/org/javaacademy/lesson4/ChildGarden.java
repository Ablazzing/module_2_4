package org.javaacademy.lesson4;

import java.util.ArrayList;
import java.util.List;

/**
 * Детский сад
 */
public class ChildGarden {
    private List<Child>[] groups;

    public ChildGarden(int countGroups) {
        groups = new List[countGroups];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new ArrayList<>();
        }
    }

    public void addChild(Child child) {
        groups[child.hashCode() % groups.length].add(child);
    }

    public boolean hasChild(Child child) {
        int groupIndex = child.hashCode() % groups.length;
        List<Child> group = groups[groupIndex];
        for (Child element : group) {
            if (child.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public List<Child>[] getGroups() {
        return groups;
    }
}
