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

/** An abstract implementation of a visitor over RegExpNode that does not return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** is a no-op.
 **/
@SuppressWarnings("unused")
public class RegExpNodeAbstractVisitor_void extends RegExpNodeVisitorRunnable1 {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, it is a no-op; subclasses may override this behavior.
    **/
    public void defaultCase(RegExpNode that) {}

    /* Methods to visit an item. */
    public void forRegExpNode(RegExpNode that) {
        defaultCase(that);
    }

    public void forRegExpAbstractNode(RegExpAbstractNode that) {
        forRegExpNode(that);
    }

    public void forRegExpPattern(RegExpPattern that) {
        forRegExpAbstractNode(that);
    }

    public void forRegExpDisjunction(RegExpDisjunction that) {
        forRegExpAbstractNode(that);
    }

    public void forRegExpBaseDisjunction(RegExpBaseDisjunction that) {
        forRegExpDisjunction(that);
    }

    public void forRegExpConsDisjunction(RegExpConsDisjunction that) {
        forRegExpDisjunction(that);
    }

    public void forRegExpAlternative(RegExpAlternative that) {
        forRegExpAbstractNode(that);
    }

    public void forRegExpEmptyAlternative(RegExpEmptyAlternative that) {
        forRegExpAlternative(that);
    }

    public void forRegExpConsAlternative(RegExpConsAlternative that) {
        forRegExpAlternative(that);
    }

    public void forRegExpTerm(RegExpTerm that) {
        forRegExpAbstractNode(that);
    }

    public void forRegExpAssertion(RegExpAssertion that) {
        forRegExpTerm(that);
    }

    public void forRegExpAssertionCaret(RegExpAssertionCaret that) {
        forRegExpAssertion(that);
    }

    public void forRegExpAssertionDollar(RegExpAssertionDollar that) {
        forRegExpAssertion(that);
    }

    public void forRegExpAssertionLowerCaseB(RegExpAssertionLowerCaseB that) {
        forRegExpAssertion(that);
    }

    public void forRegExpAssertionUpperCaseB(RegExpAssertionUpperCaseB that) {
        forRegExpAssertion(that);
    }

    public void forRegExpAssertionEqual(RegExpAssertionEqual that) {
        forRegExpAssertion(that);
    }

    public void forRegExpAssertionExcla(RegExpAssertionExcla that) {
        forRegExpAssertion(that);
    }

    public void forRegExpAtom(RegExpAtom that) {
        forRegExpTerm(that);
    }

    public void forRegExpPatternChar(RegExpPatternChar that) {
        forRegExpAtom(that);
    }

    public void forRegExpDot(RegExpDot that) {
        forRegExpAtom(that);
    }

    public void forRegExpAtomEscape(RegExpAtomEscape that) {
        forRegExpAtom(that);
    }

    public void forRegExpDecimalEscape(RegExpDecimalEscape that) {
        forRegExpAtomEscape(that);
    }

    public void forRegExpCharacterEscape(RegExpCharacterEscape that) {
        forRegExpAtomEscape(that);
    }

    public void forRegExpControlEscape(RegExpControlEscape that) {
        forRegExpCharacterEscape(that);
    }

    public void forRegExpControlLetter(RegExpControlLetter that) {
        forRegExpCharacterEscape(that);
    }

    public void forRegExpHexEscapeSequence(RegExpHexEscapeSequence that) {
        forRegExpCharacterEscape(that);
    }

    public void forRegExpUnicodeEscapeSequence(RegExpUnicodeEscapeSequence that) {
        forRegExpCharacterEscape(that);
    }

    public void forRegExpIdentityEscape(RegExpIdentityEscape that) {
        forRegExpCharacterEscape(that);
    }

    public void forRegExpCharacterClassEscape(RegExpCharacterClassEscape that) {
        forRegExpAtomEscape(that);
    }

    public void forRegExpCharacterClass(RegExpCharacterClass that) {
        forRegExpAtom(that);
    }

    public void forRegExpCharacterClassInclusion(RegExpCharacterClassInclusion that) {
        forRegExpCharacterClass(that);
    }

    public void forRegExpCharacterClassExclusion(RegExpCharacterClassExclusion that) {
        forRegExpCharacterClass(that);
    }

    public void forRegExpClassRanges(RegExpClassRanges that) {
        forRegExpCharacterClass(that);
    }

    public void forRegExpEmptyClassRanges(RegExpEmptyClassRanges that) {
        forRegExpClassRanges(that);
    }

    public void forRegExpNonemptyClassRanges(RegExpNonemptyClassRanges that) {
        forRegExpClassRanges(that);
    }

    public void forRegExpNonemptyClassRangesAtom(RegExpNonemptyClassRangesAtom that) {
        forRegExpNonemptyClassRanges(that);
    }

    public void forRegExpNonemptyClassRangesAtoms(RegExpNonemptyClassRangesAtoms that) {
        forRegExpNonemptyClassRanges(that);
    }

    public void forRegExpNonemptyClassRangesDash(RegExpNonemptyClassRangesDash that) {
        forRegExpNonemptyClassRanges(that);
    }

    public void forRegExpClassAtom(RegExpClassAtom that) {
        forRegExpClassRanges(that);
    }

    public void forRegExpClassAtomDash(RegExpClassAtomDash that) {
        forRegExpClassAtom(that);
    }

    public void forRegExpClassAtomNoDash(RegExpClassAtomNoDash that) {
        forRegExpClassAtom(that);
    }

    public void forRegExpClassAtomNoDashCharacter(RegExpClassAtomNoDashCharacter that) {
        forRegExpClassAtomNoDash(that);
    }

    public void forRegExpClassEscape(RegExpClassEscape that) {
        forRegExpClassAtomNoDash(that);
    }

    public void forRegExpClassDecimalEscape(RegExpClassDecimalEscape that) {
        forRegExpClassEscape(that);
    }

    public void forRegExpClassEscapeB(RegExpClassEscapeB that) {
        forRegExpClassEscape(that);
    }

    public void forRegExpClassCharacterEscape(RegExpClassCharacterEscape that) {
        forRegExpClassEscape(that);
    }

    public void forRegExpClassCharacterClassEscape(RegExpClassCharacterClassEscape that) {
        forRegExpClassEscape(that);
    }

    public void forRegExpParen(RegExpParen that) {
        forRegExpAtom(that);
    }

    public void forRegExpParenOpt(RegExpParenOpt that) {
        forRegExpAtom(that);
    }

    public void forRegExpAtomQuantifier(RegExpAtomQuantifier that) {
        forRegExpTerm(that);
    }

    public void forRegExpQuantifier(RegExpQuantifier that) {
        forRegExpTerm(that);
    }

    public void forRegExpQuantifierPrefix(RegExpQuantifierPrefix that) {
        forRegExpTerm(that);
    }

    public void forRegExpQuantifierStar(RegExpQuantifierStar that) {
        forRegExpQuantifierPrefix(that);
    }

    public void forRegExpQuantifierPlus(RegExpQuantifierPlus that) {
        forRegExpQuantifierPrefix(that);
    }

    public void forRegExpQuantifierQuest(RegExpQuantifierQuest that) {
        forRegExpQuantifierPrefix(that);
    }

    public void forRegExpQuantifierNumber(RegExpQuantifierNumber that) {
        forRegExpQuantifierPrefix(that);
    }

    public void forRegExpNodeInfo(RegExpNodeInfo that) {
        forRegExpNode(that);
    }

    public void forRegExpCapturingParensInfo(RegExpCapturingParensInfo that) {
        forRegExpNodeInfo(that);
    }

    public void forRegExpClassRangesInfo(RegExpClassRangesInfo that) {
        forRegExpNodeInfo(that);
    }

}
