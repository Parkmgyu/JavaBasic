package javaPractice8.Practice4;

import java.util.HashMap;

public class StrongBox {
    private HashMap<String, Treasure> treasureHashMap;

    public StrongBox(){
        treasureHashMap = new HashMap<String, Treasure>();
    }

    public void store(String secret, Treasure treasure) throws DuplicateSecretException{
        if(treasureHashMap.containsKey(secret)){
            throw new DuplicateSecretException();
        } else{
            System.out.println(treasure + "을 금고에 저장했습니다.");
            treasureHashMap.put(secret, treasure);
        }
    }
    public Treasure getTreasure(String secret) throws IllegalSecretException{
        Treasure treasure = treasureHashMap.get(secret);

        if(treasure == null) {
            throw new IllegalSecretException();
        } else{
            return treasure;
        }
    }
}
