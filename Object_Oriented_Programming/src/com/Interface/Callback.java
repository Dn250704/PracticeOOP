package com.Interface;

public interface Callback {
    void onCallback();
}

class EvenProcessor {
    void processEvent (Callback callback) {
        System.out.println("Event processing...");
        callback.onCallback();
    }
}
class Ex6 {
    public static void main(String[] args) {
        EvenProcessor event = new EvenProcessor();
        Callback call = new Callback() {
            @Override
            public void onCallback() {
                System.out.println("Callback executed!");
            }
        };
        event.processEvent(call);
    }
}