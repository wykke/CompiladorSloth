/* CompiladorSloth.java */
/* Generated By:JavaCC: Do not edit this line. CompiladorSloth.java */
import java.util.ArrayList;
import java.util.List;

public class CompiladorSloth implements CompiladorSlothConstants {
    private static Codigo cod = new Codigo();

        public static void main(String[] args) throws ParseException
        {
                try
                {
                        CompiladorSloth analizador = new CompiladorSloth(System.in) ;
                        analizador.Programa();
                }
                catch(ParseException e)
                {
                        System.out.println(e.getMessage());
                        System.out.println("Analizador: foram encontrados alguns erros na analise.");
                }
                finally{
                        System.out.println("\n--- Tokens Encontrados ---\n");
                        for(Token nome : cod.getTokenList()){
                System.out.println(
                                        "Token: " + tokenImage[nome.kind] + " -> " + nome.toString());
                }
                }
        }

  static final public void Programa() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case GET:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      Read();
    }
    jj_consume_token(0);
}

  static final public void Importacao() throws ParseException {Token a,b;
    a = jj_consume_token(IMPORT);
cod.add(a);
    b = jj_consume_token(STRING);
cod.add(b);
}

  static final public void Execucao() throws ParseException {Token a,b;
    a = jj_consume_token(FIRST);
cod.add(a);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INTEIRO:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      Linha();
    }
    b = jj_consume_token(LAST);
cod.add(b);
}

  static final public void Linha() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void Write() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void ManVar() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void TipoVar() throws ParseException {Token a=null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TIPOBOOLEAN:{
      a = jj_consume_token(TIPOBOOLEAN);
      break;
      }
    case TIPOCHAR:{
      a = jj_consume_token(TIPOCHAR);
      break;
      }
    case TIPODOUBLE:{
      a = jj_consume_token(TIPODOUBLE);
      break;
      }
    case TIPOINT:{
      a = jj_consume_token(TIPOINT);
      break;
      }
    case TIPOSTRING:{
      a = jj_consume_token(TIPOSTRING);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
cod.add(a);
}

  static final public void NomeVar() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void Atribuicao() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void Read() throws ParseException {Token a,b,c;
    a = jj_consume_token(GET);
cod.add(a);
    b = jj_consume_token(ABREPAR);
cod.add(b);
    c = jj_consume_token(FECHAPAR);
cod.add(c);
}

  static final public void Expressao() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void Operador() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void OpArit() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void OpRelac() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void ValorVar() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void Booleano() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void FluxoDados() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void While() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void For() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void Foreach() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void If() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static final public void Bloco() throws ParseException {
    jj_consume_token(INTEIRO);
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorSlothTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[3];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x0,0x0,0x3e00,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x100000,0x1000000,0x0,};
	}

  /** Constructor with InputStream. */
  public CompiladorSloth(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CompiladorSloth(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new CompiladorSlothTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public CompiladorSloth(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new CompiladorSlothTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new CompiladorSlothTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public CompiladorSloth(CompiladorSlothTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompiladorSlothTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[61];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 3; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 61; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private int trace_indent = 0;
  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}

class Codigo
{
    private List<Token> tokenList = new ArrayList<Token>();

        public void add(Token t){
                tokenList.add(t);
        }

        public List<Token> getTokenList(){
                return tokenList;
        }
}
