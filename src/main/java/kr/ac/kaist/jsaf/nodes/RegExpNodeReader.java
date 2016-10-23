package kr.ac.kaist.jsaf.nodes;

import java.lang.Double;
import java.lang.String;
import java.math.BigInteger;
import java.io.Writer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import kr.ac.kaist.jsaf.nodes_util.*;
import kr.ac.kaist.jsaf.useful.*;
import edu.rice.cs.plt.tuple.Option;

/** A utility class for deserializing a node description generated by 
  * serialize(java.io.Writer).
  */
@SuppressWarnings("unused")
public class RegExpNodeReader {

    public static RegExpNode read(java.lang.String s) throws java.io.IOException {
        return read(new java.io.StringReader(s));
    }

    public static RegExpNode read(java.io.Reader r) throws java.io.IOException {
        return new RegExpNodeReader(new java.io.BufferedReader(r)).readRegExpNode();
    }

    protected java.io.BufferedReader in;
    protected char currentChar=' ';

    protected RegExpNodeReader(java.io.BufferedReader r) { in = r; }

    public RegExpNode readRegExpNode() throws java.io.IOException {
        java.lang.String name = readWord();
        if (name.equals("_")) return null;
        if (name.equals("RegExpPattern:")) return readRegExpPatternBody();
        if (name.equals("RegExpBaseDisjunction:")) return readRegExpBaseDisjunctionBody();
        if (name.equals("RegExpConsDisjunction:")) return readRegExpConsDisjunctionBody();
        if (name.equals("RegExpEmptyAlternative:")) return readRegExpEmptyAlternativeBody();
        if (name.equals("RegExpConsAlternative:")) return readRegExpConsAlternativeBody();
        if (name.equals("RegExpAssertionCaret:")) return readRegExpAssertionCaretBody();
        if (name.equals("RegExpAssertionDollar:")) return readRegExpAssertionDollarBody();
        if (name.equals("RegExpAssertionLowerCaseB:")) return readRegExpAssertionLowerCaseBBody();
        if (name.equals("RegExpAssertionUpperCaseB:")) return readRegExpAssertionUpperCaseBBody();
        if (name.equals("RegExpAssertionEqual:")) return readRegExpAssertionEqualBody();
        if (name.equals("RegExpAssertionExcla:")) return readRegExpAssertionExclaBody();
        if (name.equals("RegExpPatternChar:")) return readRegExpPatternCharBody();
        if (name.equals("RegExpDot:")) return readRegExpDotBody();
        if (name.equals("RegExpDecimalEscape:")) return readRegExpDecimalEscapeBody();
        if (name.equals("RegExpControlEscape:")) return readRegExpControlEscapeBody();
        if (name.equals("RegExpControlLetter:")) return readRegExpControlLetterBody();
        if (name.equals("RegExpHexEscapeSequence:")) return readRegExpHexEscapeSequenceBody();
        if (name.equals("RegExpUnicodeEscapeSequence:")) return readRegExpUnicodeEscapeSequenceBody();
        if (name.equals("RegExpIdentityEscape:")) return readRegExpIdentityEscapeBody();
        if (name.equals("RegExpCharacterClassEscape:")) return readRegExpCharacterClassEscapeBody();
        if (name.equals("RegExpCharacterClassInclusion:")) return readRegExpCharacterClassInclusionBody();
        if (name.equals("RegExpCharacterClassExclusion:")) return readRegExpCharacterClassExclusionBody();
        if (name.equals("RegExpEmptyClassRanges:")) return readRegExpEmptyClassRangesBody();
        if (name.equals("RegExpNonemptyClassRangesAtom:")) return readRegExpNonemptyClassRangesAtomBody();
        if (name.equals("RegExpNonemptyClassRangesAtoms:")) return readRegExpNonemptyClassRangesAtomsBody();
        if (name.equals("RegExpNonemptyClassRangesDash:")) return readRegExpNonemptyClassRangesDashBody();
        if (name.equals("RegExpClassAtomDash:")) return readRegExpClassAtomDashBody();
        if (name.equals("RegExpClassAtomNoDashCharacter:")) return readRegExpClassAtomNoDashCharacterBody();
        if (name.equals("RegExpClassDecimalEscape:")) return readRegExpClassDecimalEscapeBody();
        if (name.equals("RegExpClassEscapeB:")) return readRegExpClassEscapeBBody();
        if (name.equals("RegExpClassCharacterEscape:")) return readRegExpClassCharacterEscapeBody();
        if (name.equals("RegExpClassCharacterClassEscape:")) return readRegExpClassCharacterClassEscapeBody();
        if (name.equals("RegExpParen:")) return readRegExpParenBody();
        if (name.equals("RegExpParenOpt:")) return readRegExpParenOptBody();
        if (name.equals("RegExpAtomQuantifier:")) return readRegExpAtomQuantifierBody();
        if (name.equals("RegExpQuantifier:")) return readRegExpQuantifierBody();
        if (name.equals("RegExpQuantifierStar:")) return readRegExpQuantifierStarBody();
        if (name.equals("RegExpQuantifierPlus:")) return readRegExpQuantifierPlusBody();
        if (name.equals("RegExpQuantifierQuest:")) return readRegExpQuantifierQuestBody();
        if (name.equals("RegExpQuantifierNumber:")) return readRegExpQuantifierNumberBody();
        if (name.equals("RegExpCapturingParensInfo:")) return readRegExpCapturingParensInfoBody();
        if (name.equals("RegExpClassRangesInfo:")) return readRegExpClassRangesInfoBody();
        throw error();
    }

    private RegExpPattern readRegExpPatternBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("disjunction = ");
        RegExpDisjunction read_disjunction = (RegExpDisjunction) readRegExpNode();
        return new RegExpPattern(read_info, read_disjunction);
    }

    private RegExpBaseDisjunction readRegExpBaseDisjunctionBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("a = ");
        RegExpAlternative read_a = (RegExpAlternative) readRegExpNode();
        return new RegExpBaseDisjunction(read_info, read_a);
    }

    private RegExpConsDisjunction readRegExpConsDisjunctionBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("a = ");
        RegExpAlternative read_a = (RegExpAlternative) readRegExpNode();
        readFieldDelim("d = ");
        RegExpDisjunction read_d = (RegExpDisjunction) readRegExpNode();
        return new RegExpConsDisjunction(read_info, read_a, read_d);
    }

    private RegExpEmptyAlternative readRegExpEmptyAlternativeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpEmptyAlternative(read_info);
    }

    private RegExpConsAlternative readRegExpConsAlternativeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("a = ");
        RegExpAlternative read_a = (RegExpAlternative) readRegExpNode();
        readFieldDelim("t = ");
        RegExpTerm read_t = (RegExpTerm) readRegExpNode();
        return new RegExpConsAlternative(read_info, read_a, read_t);
    }

    private RegExpAssertionCaret readRegExpAssertionCaretBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpAssertionCaret(read_info);
    }

    private RegExpAssertionDollar readRegExpAssertionDollarBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpAssertionDollar(read_info);
    }

    private RegExpAssertionLowerCaseB readRegExpAssertionLowerCaseBBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpAssertionLowerCaseB(read_info);
    }

    private RegExpAssertionUpperCaseB readRegExpAssertionUpperCaseBBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpAssertionUpperCaseB(read_info);
    }

    private RegExpAssertionEqual readRegExpAssertionEqualBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("d = ");
        RegExpDisjunction read_d = (RegExpDisjunction) readRegExpNode();
        return new RegExpAssertionEqual(read_info, read_d);
    }

    private RegExpAssertionExcla readRegExpAssertionExclaBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("d = ");
        RegExpDisjunction read_d = (RegExpDisjunction) readRegExpNode();
        return new RegExpAssertionExcla(read_info, read_d);
    }

    private RegExpPatternChar readRegExpPatternCharBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpPatternChar(read_info, read_str);
    }

    private RegExpDot readRegExpDotBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpDot(read_info);
    }

    private RegExpDecimalEscape readRegExpDecimalEscapeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpDecimalEscape(read_info, read_str);
    }

    private RegExpControlEscape readRegExpControlEscapeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpControlEscape(read_info, read_str);
    }

    private RegExpControlLetter readRegExpControlLetterBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpControlLetter(read_info, read_str);
    }

    private RegExpHexEscapeSequence readRegExpHexEscapeSequenceBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpHexEscapeSequence(read_info, read_str);
    }

    private RegExpUnicodeEscapeSequence readRegExpUnicodeEscapeSequenceBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpUnicodeEscapeSequence(read_info, read_str);
    }

    private RegExpIdentityEscape readRegExpIdentityEscapeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpIdentityEscape(read_info, read_str);
    }

    private RegExpCharacterClassEscape readRegExpCharacterClassEscapeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpCharacterClassEscape(read_info, read_str);
    }

    private RegExpCharacterClassInclusion readRegExpCharacterClassInclusionBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("r = ");
        RegExpClassRanges read_r = (RegExpClassRanges) readRegExpNode();
        return new RegExpCharacterClassInclusion(read_info, read_r);
    }

    private RegExpCharacterClassExclusion readRegExpCharacterClassExclusionBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("r = ");
        RegExpClassRanges read_r = (RegExpClassRanges) readRegExpNode();
        return new RegExpCharacterClassExclusion(read_info, read_r);
    }

    private RegExpEmptyClassRanges readRegExpEmptyClassRangesBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpEmptyClassRanges(read_info);
    }

    private RegExpNonemptyClassRangesAtom readRegExpNonemptyClassRangesAtomBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("a = ");
        RegExpClassAtom read_a = (RegExpClassAtom) readRegExpNode();
        return new RegExpNonemptyClassRangesAtom(read_info, read_a);
    }

    private RegExpNonemptyClassRangesAtoms readRegExpNonemptyClassRangesAtomsBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("a = ");
        RegExpClassAtom read_a = (RegExpClassAtom) readRegExpNode();
        readFieldDelim("r = ");
        RegExpNonemptyClassRanges read_r = (RegExpNonemptyClassRanges) readRegExpNode();
        return new RegExpNonemptyClassRangesAtoms(read_info, read_a, read_r);
    }

    private RegExpNonemptyClassRangesDash readRegExpNonemptyClassRangesDashBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("a1 = ");
        RegExpClassAtom read_a1 = (RegExpClassAtom) readRegExpNode();
        readFieldDelim("a2 = ");
        RegExpClassAtom read_a2 = (RegExpClassAtom) readRegExpNode();
        readFieldDelim("r = ");
        RegExpClassRanges read_r = (RegExpClassRanges) readRegExpNode();
        return new RegExpNonemptyClassRangesDash(read_info, read_a1, read_a2, read_r);
    }

    private RegExpClassAtomDash readRegExpClassAtomDashBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpClassAtomDash(read_info);
    }

    private RegExpClassAtomNoDashCharacter readRegExpClassAtomNoDashCharacterBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("str = ");
        String read_str = readString();
        return new RegExpClassAtomNoDashCharacter(read_info, read_str);
    }

    private RegExpClassDecimalEscape readRegExpClassDecimalEscapeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("esc = ");
        RegExpDecimalEscape read_esc = (RegExpDecimalEscape) readRegExpNode();
        return new RegExpClassDecimalEscape(read_info, read_esc);
    }

    private RegExpClassEscapeB readRegExpClassEscapeBBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpClassEscapeB(read_info);
    }

    private RegExpClassCharacterEscape readRegExpClassCharacterEscapeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("esc = ");
        RegExpCharacterEscape read_esc = (RegExpCharacterEscape) readRegExpNode();
        return new RegExpClassCharacterEscape(read_info, read_esc);
    }

    private RegExpClassCharacterClassEscape readRegExpClassCharacterClassEscapeBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("esc = ");
        RegExpCharacterClassEscape read_esc = (RegExpCharacterClassEscape) readRegExpNode();
        return new RegExpClassCharacterClassEscape(read_info, read_esc);
    }

    private RegExpParen readRegExpParenBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("disjunction = ");
        RegExpDisjunction read_disjunction = (RegExpDisjunction) readRegExpNode();
        return new RegExpParen(read_info, read_disjunction);
    }

    private RegExpParenOpt readRegExpParenOptBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("disjunction = ");
        RegExpDisjunction read_disjunction = (RegExpDisjunction) readRegExpNode();
        return new RegExpParenOpt(read_info, read_disjunction);
    }

    private RegExpAtomQuantifier readRegExpAtomQuantifierBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("atom = ");
        RegExpAtom read_atom = (RegExpAtom) readRegExpNode();
        readFieldDelim("quant = ");
        RegExpQuantifier read_quant = (RegExpQuantifier) readRegExpNode();
        return new RegExpAtomQuantifier(read_info, read_atom, read_quant);
    }

    private RegExpQuantifier readRegExpQuantifierBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("prefix = ");
        RegExpQuantifierPrefix read_prefix = (RegExpQuantifierPrefix) readRegExpNode();
        readFieldDelim("greedy = ");
        boolean read_greedy = readBoolean();
        return new RegExpQuantifier(read_info, read_prefix, read_greedy);
    }

    private RegExpQuantifierStar readRegExpQuantifierStarBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpQuantifierStar(read_info);
    }

    private RegExpQuantifierPlus readRegExpQuantifierPlusBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpQuantifierPlus(read_info);
    }

    private RegExpQuantifierQuest readRegExpQuantifierQuestBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        return new RegExpQuantifierQuest(read_info);
    }

    private RegExpQuantifierNumber readRegExpQuantifierNumberBody() throws java.io.IOException {
        readFieldDelim("info = ");
        RegExpNodeInfo read_info = (RegExpNodeInfo) readRegExpNode();
        readFieldDelim("first = ");
        Integer read_first = (Integer) readUnknownObject();
        readFieldDelim("second = ");
        Option<Integer> read_second = readOptionOfInteger();
        return new RegExpQuantifierNumber(read_info, read_first, read_second);
    }

    private RegExpCapturingParensInfo readRegExpCapturingParensInfoBody() throws java.io.IOException {
        readFieldDelim("parenCount = ");
        int read_parenCount = readInt();
        return new RegExpCapturingParensInfo(read_parenCount);
    }

    private RegExpClassRangesInfo readRegExpClassRangesInfoBody() throws java.io.IOException {
        readFieldDelim("noCaret = ");
        boolean read_noCaret = readBoolean();
        return new RegExpClassRangesInfo(read_noCaret);
    }


    private Option<Integer> readOptionOfInteger() throws java.io.IOException {
        if (readOptionHeader()) {
            Integer elt_result = (Integer) readUnknownObject();
            readExpected(")");
            return Option.<Integer>some(elt_result);
        }
        else { return Option.<Integer>none(); }
    }

    protected boolean readBoolean() throws java.io.IOException {
      char c = readCharWord();
      char t = c;
      while (!java.lang.Character.isWhitespace(t)) t=next();
      if (c=='t') return true;
      if (c=='f') return false;
      throw error();
    }
    
    protected char readChar() throws java.io.IOException {
      readExpected("\"");
      java.lang.String word = readTo('"', true);
      java.lang.String result = unescape(word);
      if (result.length() != 1) throw error();
      return result.charAt(0);
    }
    
    protected byte readByte() throws java.io.IOException {
      java.lang.String word = readNum();
      try { return java.lang.Byte.parseByte(word); }
      catch (java.lang.NumberFormatException e) { throw error(); }
    }
    
    protected short readShort() throws java.io.IOException {
      java.lang.String word = readNum();
      try { return java.lang.Short.parseShort(word); }
      catch (java.lang.NumberFormatException e) { throw error(); }
    }
    
    protected int readInt() throws java.io.IOException {
      java.lang.String word = readNum();
      try { return java.lang.Integer.parseInt(word); }
      catch (java.lang.NumberFormatException e) { throw error(); }
    }
    
    protected long readLong() throws java.io.IOException {
      java.lang.String word = readNum();
      try { return java.lang.Long.parseLong(word); }
      catch (java.lang.NumberFormatException e) { throw error(); }
    }
    
    protected float readFloat() throws java.io.IOException {
      java.lang.String word = readWord();
      try { return java.lang.Float.parseFloat(word); }
      catch (java.lang.NumberFormatException e) { throw error(); }
    }
    
    protected double readDouble() throws java.io.IOException {
      java.lang.String word = readWord();
      try { return java.lang.Double.parseDouble(word); }
      catch (java.lang.NumberFormatException e) { throw error(); }
    }
    
    protected java.lang.String readString() throws java.io.IOException {
      char delim = readCharWord();
      if (delim == '_') { return null; }
      if (delim != '"') { throw error(); }
      next();
      java.lang.String word = readTo('"', true);
      return unescape(word);
    }
    
    protected Object wordToUnknownObject(java.lang.String word) throws java.io.IOException {
      if (word.equals("_")) return null;
      java.io.ObjectInputStream objIn = toObjectStream(word);
      try { return objIn.readObject(); } // may throw an IOException
      catch (java.lang.ClassNotFoundException e) {
        throw new java.io.IOException("ClassNotFoundException: " + e.getMessage());
      }
      finally {
        try { objIn.close(); }
        catch (java.io.IOException e) { /* made a best attempt; ignore */ }
      }
    }
    
    protected Object readUnknownObject() throws java.io.IOException {
      java.lang.String word = readWord();
      readToNewline();
      return wordToUnknownObject(word);
    }
    
    /** Read the next word, delimited by whitespace, starting from curr().
        curr() is next whitespace char after word. */
    protected java.lang.String readWord() throws java.io.IOException {
      char c = readCharWord();
      java.lang.StringBuilder result = new java.lang.StringBuilder();
      do {
        result.append(c);
        c = next();
      } while (!java.lang.Character.isWhitespace(c));
      return result.toString();
    }
    
    /** Read the next number starting with curr(): whitespace, possible
        '-', digit sequence.  curr() is first non-digit char
        thereafter. */
    protected java.lang.String readNum() throws java.io.IOException {
      char c = readCharWord();
      java.lang.StringBuilder result = new java.lang.StringBuilder();
      if (c!='-' && !java.lang.Character.isDigit(c))
        throw error();
      do {
        result.append(c);
        c = next();
      } while (java.lang.Character.isDigit(c));
      return result.toString();
    }
    
    /** Read the next character, skipping any previous whitespace. */
    protected char readCharWord() throws java.io.IOException {
      char c = currentChar;
      while (java.lang.Character.isWhitespace(c)) {
        c = next();
      }
      return c;
    }
    
    /** Discard whitespace, then read exactly the string s.  curr() just afterwards. */
    protected void readExpected(java.lang.String s) throws java.io.IOException {
      char c = readCharWord();
      for (int i = 0; i < s.length(); i++) {
        if (c != s.charAt(i)) {
          System.out.println("Was expecting '"+s+"', saw '"+c+
                             "' instead of '"+s.charAt(i)+"'");
          throw error();
        }
        c = next();
      }
    }
    
    /** Look for and discard field delimiter. */
    protected void readFieldDelim(java.lang.String s) throws java.io.IOException {
      readExpected(s);
    }
    
    /** Look for next element in list. */
    protected boolean readMoreListElements() throws java.io.IOException {
      char c = readCharWord();
      if (c=='}') {
        next();
        return false;
      }
      if (c=='*') {
        next();
        return true;
      }
      throw error();
    }
    
    /** Look for header of option type.  Return true if contents must be
        parsed, false if it is Option.none(). */
    protected boolean readOptionHeader() throws java.io.IOException {
      char c = readCharWord();
      if (c=='~') {
        next();
        return false;
      }
      if (c=='(') {
        next();
        return true;
      }
      throw error();
    }
    
    /**
     * Read up to a delimiter; it is an error if a newline or eof is encountered first.
     * @return The the characters read before the delimiter.
     */
    protected java.lang.String readTo(char delim, boolean skipEscape) throws java.io.IOException {
      java.lang.StringBuilder result = new java.lang.StringBuilder();
      boolean escape = false;
      char c = curr();
      while (escape || c != delim) {
        if (c == '\n' || c == '\r') throw error();
        result.append(c);
        if (escape) escape = false;
        else if (skipEscape && c == '\\') escape = true;
        c = next();
      }
      next(); // skip delim
      return result.toString();
    }
    
    /**
     * Skip to one of the given delimiters; it is an error if a newline or eof is encountered first.
     * @return The delimiter that was found.
     */
    protected char skipTo(char... delims) throws java.io.IOException {
      char c = currentChar;
      while (true) {
        if (c == '\n' || c == '\r') throw error();
        for (char delim : delims) {
          if (c == delim) return delim;
        }
        c = next();
      }
    }
    
    protected java.lang.String readToNewline() throws java.io.IOException {
      java.lang.String result = in.readLine();
      if (result == null) throw error();
      readCharWord();
      return result;
    }
    
    protected char next() throws java.io.IOException {
      int c = in.read();
      if (c == -1) throw error();
      currentChar = (char)c;
      return currentChar;
    }
    
    protected char curr() {
      return currentChar;
    }
    
    /** Unescapes a subset of valid Java-style escaped strings.  Unicode escapes are not
      * supported (the JLS doesn't treat them as part of this escaping process, either).
      * Octal escapes are required to use exactly 3 digits.
      */
    protected java.lang.String unescape(java.lang.String s) throws java.io.IOException {
      boolean escape = false;
      final java.lang.StringBuilder digits = new java.lang.StringBuilder();
      boolean changed = false;
      final java.lang.StringBuilder result = new java.lang.StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (escape) {
          switch (c) {
            case 'b': result.append('\b'); break;
            case 't': result.append('\t'); break;
            case 'n': result.append('\n'); break;
            case 'f': result.append('\f'); break;
            case 'r': result.append('\r'); break;
    
            case '"': case '\'': case '\\':
              result.append(c); break;
    
            case '0': case '1': case '2': case '3':
            case '4': case '5': case '6': case '7':
              digits.append(c);
              if (digits.length() == 3) {
                // this should succeed -- there are guaranteed to be 3 octal digits
                result.append((char) java.lang.Integer.parseInt(digits.toString(), 8));
                digits.setLength(0);
              }
              break;
    
            default:
              throw error();
          }
          if (digits.length() == 0) escape = false;
        }
        else {
          if (c == '\\') { escape = true; changed = true; }
          else { result.append(c); }
        }
      }
      if (escape) throw error(); // escape was not completed
      return changed ? result.toString() : s;
    }
    
    /** Treat a string representation of a hexadecimal number as an ObjectInputStream */
    protected java.io.ObjectInputStream toObjectStream(java.lang.String byteString)
        throws java.io.IOException {
      if (byteString.length() % 2 != 0) throw error();
      int length = byteString.length() / 2;
      byte[] bytes = new byte[length];
      for (int i = 0; i < length; i++) {
        java.lang.String b = byteString.substring(i*2, i*2+2);
        try {
          int unsigned = java.lang.Integer.parseInt(b, 16);
          if (unsigned < 128) bytes[i] = (byte) unsigned;
          else bytes[i] = (byte) (unsigned - 256); // maps 255 to -1, 128 to -128
        }
        catch (java.lang.NumberFormatException e) { throw error(); }
      }
      // this may throw an IOException
      return new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(bytes));
    }
    
    protected java.io.IOException error() {
      return new java.io.IOException("Serialized data is not properly encoded");
    }
}
