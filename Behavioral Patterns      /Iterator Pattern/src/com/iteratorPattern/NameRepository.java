package com.iteratorPattern;

public class NameRepository implements Container {
    private String names[] ={"1","2","3","4"};


    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            } return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            } return null;
        }
    }
}
