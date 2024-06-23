package ex_21052024Interfacekeyword;

public interface Brake {
	
	void startEngine();
    void stopEngine();

   default void haltingEngineJustStart(){
       System.out.println("Halt the Engine");
   }
    default void haltingEngineJustStop(){
        System.out.println("Halt the Engine");
    }

}
