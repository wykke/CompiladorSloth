import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExpressionOp{

    public int expressionReturn(List<Integer> exp){
        ListIterator<Integer> litr = exp.listIterator();
        int elem, previous=-1, next=-1;

        for(int i=0;i<5;i++){
            int[] operador = opType(i);
            while(litr.hasNext()){
                elem = litr.next();
                if(elem>=operador[0]&&elem<=operador[1]){
                    next = litr.next();
                    litr.remove();
                    litr.previous();
                    litr.set(callOp(i, previous, next));
                    litr.previous();
                    litr.remove();
                    litr.next();
                }
                previous = elem;
            }
        }
        return exp.get(0);
    }

    private int[] opType(int i){
        switch(i){
            case 0:
                int pow[] = {27,27}; 
                return pow;
            case 1:
                int arit[] = {23,26}; 
                return arit;
            case 2:
                int add[] = {22,22}; 
                return add;
            case 3:
                int rel[] = {32,37}; 
                return rel;
            case 4:
                int log[] = {39,42}; 
                return log;
        }
        return new int[2];
    }

    private int callOp(int i, int previous, int next){
        switch(i){
            case 0:
                return opPow(previous,next);
            case 1:
                return opArit(previous,next);
            case 2:
                return opAdd(previous,next);
            case 3:
                return opRel(previous,next);
            case 4:
                return opLog(previous,next);
        }
        return -1;
    }

    private int opAdd(int typeA, int typeB){
        return opAddRet[typeA][typeB];
    }

    private int opArit(int typeA, int typeB){
        return opAritRet[typeA][typeB];
    }

    private int opPow(int typeA, int typeB){
        return opPowRet[typeA][typeB];
    }

    private int opRel(int typeA, int typeB){
        return opRelRet[typeA][typeB];
    }

    private int opLog(int typeA, int typeB){
        return opLogRet[typeA][typeB];
    }

    private boolean canExpReceive[][] = {
        //int   dou     char    str     bool
        {true,  true,   true,   false,  false   },         //int       = 0
        {false, true,   false,  false,  false   },         //double    = 1
        {true,  true,   true,   false,  false   },         //char      = 2
        {false, false,  false,  true,   false   },         //string    = 3
        {false, false,  false,  false,  true    }          //boolean   = 4
    };

    private int opAddRet[][] = {
        //int   dou     char    str     bool
        {0,     1,      0,      3,      -1,     },         //int       = 0
        {1,     1,      1,      3,      -1,     },         //double    = 1
        {0,     1,      2,      3,      -1,     },         //char      = 2
        {3,     3,      3,      3,      3,      },         //string    = 3
        {-1,    -1,     -1,     3,      4,      }         //boolean   = 4
    };

    private int opAritRet[][] = {
        //int   dou     char    str     bool
        {0,     1,      0,      -1,     -1,     },         //int       = 0
        {1,     1,      1,      -1,     -1,     },         //double    = 1
        {0,     1,      2,      -1,     -1,     },         //char      = 2
        {-1,    -1,     -1,     -1,     -1,     },         //string    = 3
        {-1,    -1,     -1,     -1,     4,      }         //boolean   = 4
    };

    private int opPowRet[][] = {
        //int   dou     char    str     bool
        {1,     1,      1,      -1,     -1,     },         //int       = 0
        {1,     1,      1,      -1,     -1,     },         //double    = 1
        {1,     1,      1,      -1,     -1,     },         //char      = 2
        {-1,    -1,     -1,     -1,     -1,     },         //string    = 3
        {-1,    -1,     -1,     -1,     -1,     }         //boolean   = 4
    };

    private int opRelRet[][] = {
        //int   dou     char    str     bool
        {4,     4,      4,      -1,     -1,     },         //int       = 0
        {4,     4,      4,      -1,     -1,     },         //double    = 1
        {4,     4,      4,      -1,     -1,     },         //char      = 2
        {-1,    -1,     -1,     4,      -1,     },         //string    = 3
        {-1,    -1,     -1,     -1,     4,      }         //boolean   = 4
    };

    private int opLogRet[][] = {
        //int   dou     char    str     bool
        {-1,    -1,     -1,     -1,     -1,     },         //int       = 0
        {-1,    -1,     -1,     -1,     -1,     },         //double    = 1
        {-1,    -1,     -1,     -1,     -1,     },         //char      = 2
        {-1,    -1,     -1,     -1,     -1,     },         //string    = 3
        {-1,    -1,     -1,     -1,     4,      }         //boolean   = 4
    };
}