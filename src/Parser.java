
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Tokens.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\005\000\002\002\004\000\002\002" +
    "\004\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\004\000\002\003\005\000" +
    "\002\003\003\000\002\003\003\000\002\003\003\000\002" +
    "\003\003\000\002\003\003\000\002\003\003\000\002\003" +
    "\003\000\002\003\003\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\003\004\000\002\003\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\044\000\040\006\006\012\023\014\017\015\024\016" +
    "\021\017\004\020\013\021\007\022\020\023\012\024\010" +
    "\025\005\026\016\027\022\030\015\001\002\000\020\004" +
    "\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\013\ufff6\014\ufff6" +
    "\001\002\000\020\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010" +
    "\ufff0\013\ufff0\014\ufff0\001\002\000\040\006\006\012\023" +
    "\014\017\015\024\016\021\017\004\020\013\021\007\022" +
    "\020\023\012\024\010\025\005\026\016\027\022\030\015" +
    "\001\002\000\020\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010" +
    "\ufff4\013\ufff4\014\ufff4\001\002\000\020\004\ufff1\005\ufff1" +
    "\006\ufff1\007\ufff1\010\ufff1\013\ufff1\014\ufff1\001\002\000" +
    "\014\004\045\005\032\006\031\007\027\010\030\001\002" +
    "\000\020\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\013" +
    "\ufff2\014\ufff2\001\002\000\020\004\ufff5\005\ufff5\006\ufff5" +
    "\007\ufff5\010\ufff5\013\ufff5\014\ufff5\001\002\000\042\002" +
    "\043\006\006\012\023\014\017\015\024\016\021\017\004" +
    "\020\013\021\007\022\020\023\012\024\010\025\005\026" +
    "\016\027\022\030\015\001\002\000\020\004\ufff8\005\ufff8" +
    "\006\ufff8\007\ufff8\010\ufff8\013\ufff8\014\ufff8\001\002\000" +
    "\020\004\uffef\005\uffef\006\uffef\007\uffef\010\uffef\013\uffef" +
    "\014\uffef\001\002\000\020\004\ufff7\005\ufff7\006\ufff7\007" +
    "\ufff7\010\ufff7\013\ufff7\014\ufff7\001\002\000\020\004\ufff3" +
    "\005\ufff3\006\ufff3\007\ufff3\010\ufff3\013\ufff3\014\ufff3\001" +
    "\002\000\040\006\006\012\023\014\017\015\024\016\021" +
    "\017\004\020\013\021\007\022\020\023\012\024\010\025" +
    "\005\026\016\027\022\030\015\001\002\000\020\004\uffee" +
    "\005\uffee\006\uffee\007\uffee\010\uffee\013\uffee\014\uffee\001" +
    "\002\000\040\006\006\012\023\014\017\015\024\016\021" +
    "\017\004\020\013\021\007\022\020\023\012\024\010\025" +
    "\005\026\016\027\022\030\015\001\002\000\040\006\006" +
    "\012\023\014\017\015\024\016\021\017\004\020\013\021" +
    "\007\022\020\023\012\024\010\025\005\026\016\027\022" +
    "\030\015\001\002\000\014\005\032\006\031\007\027\010" +
    "\030\014\026\001\002\000\020\004\uffec\005\uffec\006\uffec" +
    "\007\uffec\010\uffec\013\uffec\014\uffec\001\002\000\040\006" +
    "\006\012\023\014\017\015\024\016\021\017\004\020\013" +
    "\021\007\022\020\023\012\024\010\025\005\026\016\027" +
    "\022\030\015\001\002\000\040\006\006\012\023\014\017" +
    "\015\024\016\021\017\004\020\013\021\007\022\020\023" +
    "\012\024\010\025\005\026\016\027\022\030\015\001\002" +
    "\000\040\006\006\012\023\014\017\015\024\016\021\017" +
    "\004\020\013\021\007\022\020\023\012\024\010\025\005" +
    "\026\016\027\022\030\015\001\002\000\040\006\006\012" +
    "\023\014\017\015\024\016\021\017\004\020\013\021\007" +
    "\022\020\023\012\024\010\025\005\026\016\027\022\030" +
    "\015\001\002\000\020\004\ufffe\005\ufffe\006\ufffe\007\027" +
    "\010\ufffe\013\ufffe\014\ufffe\001\002\000\020\004\ufffd\005" +
    "\ufffd\006\ufffd\007\027\010\ufffd\013\ufffd\014\ufffd\001\002" +
    "\000\020\004\ufffb\005\ufffb\006\ufffb\007\027\010\ufffb\013" +
    "\ufffb\014\ufffb\001\002\000\020\004\ufffc\005\ufffc\006\ufffc" +
    "\007\ufffc\010\ufffc\013\ufffc\014\ufffc\001\002\000\014\005" +
    "\032\006\031\007\027\010\030\013\040\001\002\000\020" +
    "\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\013\ufff9\014" +
    "\ufff9\001\002\000\020\004\uffed\005\032\006\031\007\027" +
    "\010\030\013\uffed\014\uffed\001\002\000\014\004\044\005" +
    "\032\006\031\007\027\010\030\001\002\000\004\002\000" +
    "\001\002\000\042\002\001\006\001\012\001\014\001\015" +
    "\001\016\001\017\001\020\001\021\001\022\001\023\001" +
    "\024\001\025\001\026\001\027\001\030\001\001\002\000" +
    "\042\002\uffff\006\uffff\012\uffff\014\uffff\015\uffff\016\uffff" +
    "\017\uffff\020\uffff\021\uffff\022\uffff\023\uffff\024\uffff\025" +
    "\uffff\026\uffff\027\uffff\030\uffff\001\002\000\020\004\ufffa" +
    "\005\ufffa\006\ufffa\007\027\010\ufffa\013\ufffa\014\ufffa\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\044\000\006\002\013\003\010\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\045\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\041\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\040\001\001\000\002\001\001\000\004" +
    "\003\036\001\001\000\004\003\024\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\035\001\001\000\004" +
    "\003\034\001\001\000\004\003\033\001\001\000\004\003" +
    "\032\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
  
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    // conectar esse parser ao scanner!
    Scanner s;
    Parser(Scanner s){ this.s=s; }

    // tabela de símbolos
    java.util.Map<String, Integer> simbolos = new java.util.HashMap<String, Integer>();
	


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // inicio ::= inicio exp SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println(e);         
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= exp SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println(e);         
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // exp ::= exp SOMA exp 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1+e2;                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // exp ::= exp MENOS exp 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1-e2;                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // exp ::= exp VEZES exp 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1*e2;                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // exp ::= exp DIVIDIDO exp 
            {
              Integer RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e1 / e2;                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // exp ::= MENOS exp 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = -e;                   
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // exp ::= LPAREN exp RPAREN 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e;                    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // exp ::= NUMERO 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n;                    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exp ::= ID 
            {
              Integer RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = simbolos.get(i);      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exp ::= UM 
            {
              Integer RESULT =null;
		int umleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int umright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object um = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 1;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exp ::= DOIS 
            {
              Integer RESULT =null;
		int doisleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int doisright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object dois = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 2;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exp ::= TRES 
            {
              Integer RESULT =null;
		int tresleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int tresright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object tres = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 3;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exp ::= QUATRO 
            {
              Integer RESULT =null;
		int quatroleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int quatroright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object quatro = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 4;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp ::= CINCO 
            {
              Integer RESULT =null;
		int cincoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cincoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object cinco = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 5;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exp ::= SEIS 
            {
              Integer RESULT =null;
		int seisleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int seisright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object seis = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 6;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // exp ::= SETE 
            {
              Integer RESULT =null;
		int seteleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int seteright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object sete = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 7;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // exp ::= OITO 
            {
              Integer RESULT =null;
		int oitoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int oitoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object oito = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 8;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // exp ::= NOVE 
            {
              Integer RESULT =null;
		int noveleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int noveright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object nove = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = 9;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // exp ::= DOBRO exp 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e+e;      
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // exp ::= ATRIB exp ID 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 simbolos.put(i.toString(), e);  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
