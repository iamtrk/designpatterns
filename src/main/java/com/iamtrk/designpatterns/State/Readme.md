
1) State interface. - defines all the actions(through methods). 

2) Each concrete state implements state interface. & the corresponding action behaviour.

3) Each concrete state has reference to the state machine (Ex: Vending machine).

4) Each concrete state implementation implements actions that change the state of the 
state machine. ()

5) State machine has reference to all the state implementations with getters/setters. with 
provision to set current state.

6) concrete state implementation changes current state of the state machine through setter 
methods described point (5).

7) In essence, all states has to implement all action behaviours. 