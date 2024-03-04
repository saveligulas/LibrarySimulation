package lib.furniture;

import physical.SmallSizedObject;

import java.util.ArrayList;

public interface Container {
    void addItem(SmallSizedObject item);
    void removeItem(SmallSizedObject item);
    ArrayList<SmallSizedObject> getItems(SmallSizedObject item);
}
