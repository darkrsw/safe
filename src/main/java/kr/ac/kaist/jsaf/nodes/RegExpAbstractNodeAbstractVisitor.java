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

/** A parametric abstract implementation of a visitor over RegExpAbstractNode that return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** throws an exception.
 **/
@SuppressWarnings("unused")
public abstract class RegExpAbstractNodeAbstractVisitor<RetType>  extends RegExpAbstractNodeVisitorLambda<RetType> {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, an exception is thrown; subclasses may override this behavior.
     * @throws IllegalArgumentException
    **/
    public RetType defaultCase(RegExpAbstractNode that) {
        throw new IllegalArgumentException("Visitor " + getClass().getName() + " does not support visiting values of type " + that.getClass().getName());
    }

    /* Methods to visit an item. */
    public RetType forRegExpAbstractNode(RegExpAbstractNode that) {
        return defaultCase(that);
    }

    public RetType forRegExpPattern(RegExpPattern that) {
        return forRegExpAbstractNode(that);
    }

    public RetType forRegExpDisjunction(RegExpDisjunction that) {
        return forRegExpAbstractNode(that);
    }

    public RetType forRegExpBaseDisjunction(RegExpBaseDisjunction that) {
        return forRegExpDisjunction(that);
    }

    public RetType forRegExpConsDisjunction(RegExpConsDisjunction that) {
        return forRegExpDisjunction(that);
    }

    public RetType forRegExpAlternative(RegExpAlternative that) {
        return forRegExpAbstractNode(that);
    }

    public RetType forRegExpEmptyAlternative(RegExpEmptyAlternative that) {
        return forRegExpAlternative(that);
    }

    public RetType forRegExpConsAlternative(RegExpConsAlternative that) {
        return forRegExpAlternative(that);
    }

    public RetType forRegExpTerm(RegExpTerm that) {
        return forRegExpAbstractNode(that);
    }

    public RetType forRegExpAssertion(RegExpAssertion that) {
        return forRegExpTerm(that);
    }

    public RetType forRegExpAssertionCaret(RegExpAssertionCaret that) {
        return forRegExpAssertion(that);
    }

    public RetType forRegExpAssertionDollar(RegExpAssertionDollar that) {
        return forRegExpAssertion(that);
    }

    public RetType forRegExpAssertionLowerCaseB(RegExpAssertionLowerCaseB that) {
        return forRegExpAssertion(that);
    }

    public RetType forRegExpAssertionUpperCaseB(RegExpAssertionUpperCaseB that) {
        return forRegExpAssertion(that);
    }

    public RetType forRegExpAssertionEqual(RegExpAssertionEqual that) {
        return forRegExpAssertion(that);
    }

    public RetType forRegExpAssertionExcla(RegExpAssertionExcla that) {
        return forRegExpAssertion(that);
    }

    public RetType forRegExpAtom(RegExpAtom that) {
        return forRegExpTerm(that);
    }

    public RetType forRegExpPatternChar(RegExpPatternChar that) {
        return forRegExpAtom(that);
    }

    public RetType forRegExpDot(RegExpDot that) {
        return forRegExpAtom(that);
    }

    public RetType forRegExpAtomEscape(RegExpAtomEscape that) {
        return forRegExpAtom(that);
    }

    public RetType forRegExpDecimalEscape(RegExpDecimalEscape that) {
        return forRegExpAtomEscape(that);
    }

    public RetType forRegExpCharacterEscape(RegExpCharacterEscape that) {
        return forRegExpAtomEscape(that);
    }

    public RetType forRegExpControlEscape(RegExpControlEscape that) {
        return forRegExpCharacterEscape(that);
    }

    public RetType forRegExpControlLetter(RegExpControlLetter that) {
        return forRegExpCharacterEscape(that);
    }

    public RetType forRegExpHexEscapeSequence(RegExpHexEscapeSequence that) {
        return forRegExpCharacterEscape(that);
    }

    public RetType forRegExpUnicodeEscapeSequence(RegExpUnicodeEscapeSequence that) {
        return forRegExpCharacterEscape(that);
    }

    public RetType forRegExpIdentityEscape(RegExpIdentityEscape that) {
        return forRegExpCharacterEscape(that);
    }

    public RetType forRegExpCharacterClassEscape(RegExpCharacterClassEscape that) {
        return forRegExpAtomEscape(that);
    }

    public RetType forRegExpCharacterClass(RegExpCharacterClass that) {
        return forRegExpAtom(that);
    }

    public RetType forRegExpCharacterClassInclusion(RegExpCharacterClassInclusion that) {
        return forRegExpCharacterClass(that);
    }

    public RetType forRegExpCharacterClassExclusion(RegExpCharacterClassExclusion that) {
        return forRegExpCharacterClass(that);
    }

    public RetType forRegExpClassRanges(RegExpClassRanges that) {
        return forRegExpCharacterClass(that);
    }

    public RetType forRegExpEmptyClassRanges(RegExpEmptyClassRanges that) {
        return forRegExpClassRanges(that);
    }

    public RetType forRegExpNonemptyClassRanges(RegExpNonemptyClassRanges that) {
        return forRegExpClassRanges(that);
    }

    public RetType forRegExpNonemptyClassRangesAtom(RegExpNonemptyClassRangesAtom that) {
        return forRegExpNonemptyClassRanges(that);
    }

    public RetType forRegExpNonemptyClassRangesAtoms(RegExpNonemptyClassRangesAtoms that) {
        return forRegExpNonemptyClassRanges(that);
    }

    public RetType forRegExpNonemptyClassRangesDash(RegExpNonemptyClassRangesDash that) {
        return forRegExpNonemptyClassRanges(that);
    }

    public RetType forRegExpClassAtom(RegExpClassAtom that) {
        return forRegExpClassRanges(that);
    }

    public RetType forRegExpClassAtomDash(RegExpClassAtomDash that) {
        return forRegExpClassAtom(that);
    }

    public RetType forRegExpClassAtomNoDash(RegExpClassAtomNoDash that) {
        return forRegExpClassAtom(that);
    }

    public RetType forRegExpClassAtomNoDashCharacter(RegExpClassAtomNoDashCharacter that) {
        return forRegExpClassAtomNoDash(that);
    }

    public RetType forRegExpClassEscape(RegExpClassEscape that) {
        return forRegExpClassAtomNoDash(that);
    }

    public RetType forRegExpClassDecimalEscape(RegExpClassDecimalEscape that) {
        return forRegExpClassEscape(that);
    }

    public RetType forRegExpClassEscapeB(RegExpClassEscapeB that) {
        return forRegExpClassEscape(that);
    }

    public RetType forRegExpClassCharacterEscape(RegExpClassCharacterEscape that) {
        return forRegExpClassEscape(that);
    }

    public RetType forRegExpClassCharacterClassEscape(RegExpClassCharacterClassEscape that) {
        return forRegExpClassEscape(that);
    }

    public RetType forRegExpParen(RegExpParen that) {
        return forRegExpAtom(that);
    }

    public RetType forRegExpParenOpt(RegExpParenOpt that) {
        return forRegExpAtom(that);
    }

    public RetType forRegExpAtomQuantifier(RegExpAtomQuantifier that) {
        return forRegExpTerm(that);
    }

    public RetType forRegExpQuantifier(RegExpQuantifier that) {
        return forRegExpTerm(that);
    }

    public RetType forRegExpQuantifierPrefix(RegExpQuantifierPrefix that) {
        return forRegExpTerm(that);
    }

    public RetType forRegExpQuantifierStar(RegExpQuantifierStar that) {
        return forRegExpQuantifierPrefix(that);
    }

    public RetType forRegExpQuantifierPlus(RegExpQuantifierPlus that) {
        return forRegExpQuantifierPrefix(that);
    }

    public RetType forRegExpQuantifierQuest(RegExpQuantifierQuest that) {
        return forRegExpQuantifierPrefix(that);
    }

    public RetType forRegExpQuantifierNumber(RegExpQuantifierNumber that) {
        return forRegExpQuantifierPrefix(that);
    }


}
