# CPUsimulatorLite

Simple CPU-simulator GUI by JAVA, Shows how Computer CPU Executes Assembly Commands, Showing the content of Main Memory, CPU Registers, CPU genral purpose registers and Stack memory every step of executing the program code

<p align="center">
<img src="https://github.com/HaniMohamed/CPUsimulatorLite-JAVA/blob/master/Screenshot%20from%202017-12-18%2009-37-05.png?raw=true" height="350"/>
</p>

<br />

### Available Commands(Assembly Instructions):

-  #### Two operands Commands:
| Inst.         | Describe                                                                       |    
| ------------- |--------------------------------------------------------------------------------| 
| ADD           | add value of 2nd operand from value of 1st operand.                            |
| SUB           | subtract value of 2nd operand from value of 1st operand.                       |
| MOV           | transfer value from 2nd operand to 1 operand.                                  |
| BNZ           | if value of 2nd operand is not zero branch to location of value of 2nd operand.|


-  #### One operand Commands:
| Inst.         | Describe                                                                       |    
| ------------- |--------------------------------------------------------------------------------| 
| SKZ           | skip next instruction if value of the operand is zero.                         |
| INC           | increment value of the opernad.                                                |
| DEC           | decrement value of the operand.                                                |
| INP           | get input value and store it to the operand.                                   |
| OUT           | output value of the opernad.                                                   |
| PUSH          | push value of the opernad to the stack.                                        |
| POP           | pop top of stack to location of the operand.                                   |
| SKIP          | skip "n" of Instructios (n =  value of operand).                               |
| SKIPZ         | pop top of stack if equal zero skip  "n" of Instructios.                       |
</p>

-  #### Zero operand Commands:

| Inst.         | Describe                                                                       |    
| ------------- |--------------------------------------------------------------------------------| 
| NEGATE        | negate the top of stack.                                                       |
| ADD           | pop the top two elements of stack sum them then push the result.               |
| MULTIPLY      | pop the top two elements of stack multiply them then push the result.          |
| END           | gend program.                                                                  |


<br />

### Available Addressing Modes:

| Addressing Mode        | Example                 |    
| ---------------------- |-------------------------| 
| Immediate              | #10                     |
| Memory Indirect        | (10)                    |
| Register               | R2                      |
| Register Indirect      | (R2)                    |

<br />

### Available General Purpose Registerts:
> Four Registers: R1, R2, R3, R4.

<br />

### ScreenShots:
<img src="https://github.com/HaniMohamed/CPUsimulatorLite-JAVA/blob/master/Screenshot%20from%202017-12-18%2009-37-05.png?raw=true" width="250"/>
<img src="https://github.com/HaniMohamed/CPUsimulatorLite-JAVA/blob/master/Screenshot%20from%202017-12-18%2009-39-05.png?raw=true" width="250"/>
<img src="https://github.com/HaniMohamed/CPUsimulatorLite-JAVA/blob/master/Screenshot%20from%202017-12-18%2009-39-13.png?raw=true" width="250"/>
<img src="https://github.com/HaniMohamed/CPUsimulatorLite-JAVA/blob/master/Screenshot%20from%202017-12-18%2009-39-21.png?raw=true" width="250"/>
<img src="https://github.com/HaniMohamed/CPUsimulatorLite-JAVA/blob/master/Screenshot%20from%202017-12-18%2009-39-29.png?raw=true" width="250"/>
