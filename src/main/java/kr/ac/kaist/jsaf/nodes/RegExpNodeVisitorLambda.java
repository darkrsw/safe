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

/** An abstract visitor over RegExpNode that provides a lambda value method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class RegExpNodeVisitorLambda<RetType> implements edu.rice.cs.plt.lambda.Lambda<RegExpNode, RetType>, RegExpNodeVisitor<RetType> {

    public RetType value(RegExpNode that) {
        return that.accept(this);
    }


    /** Process an instance of RegExpPattern. */
    public abstract RetType forRegExpPattern(RegExpPattern that);

    /** Process an instance of RegExpBaseDisjunction. */
    public abstract RetType forRegExpBaseDisjunction(RegExpBaseDisjunction that);

    /** Process an instance of RegExpConsDisjunction. */
    public abstract RetType forRegExpConsDisjunction(RegExpConsDisjunction that);

    /** Process an instance of RegExpEmptyAlternative. */
    public abstract RetType forRegExpEmptyAlternative(RegExpEmptyAlternative that);

    /** Process an instance of RegExpConsAlternative. */
    public abstract RetType forRegExpConsAlternative(RegExpConsAlternative that);

    /** Process an instance of RegExpAssertionCaret. */
    public abstract RetType forRegExpAssertionCaret(RegExpAssertionCaret that);

    /** Process an instance of RegExpAssertionDollar. */
    public abstract RetType forRegExpAssertionDollar(RegExpAssertionDollar that);

    /** Process an instance of RegExpAssertionLowerCaseB. */
    public abstract RetType forRegExpAssertionLowerCaseB(RegExpAssertionLowerCaseB that);

    /** Process an instance of RegExpAssertionUpperCaseB. */
    public abstract RetType forRegExpAssertionUpperCaseB(RegExpAssertionUpperCaseB that);

    /** Process an instance of RegExpAssertionEqual. */
    public abstract RetType forRegExpAssertionEqual(RegExpAssertionEqual that);

    /** Process an instance of RegExpAssertionExcla. */
    public abstract RetType forRegExpAssertionExcla(RegExpAssertionExcla that);

    /** Process an instance of RegExpPatternChar. */
    public abstract RetType forRegExpPatternChar(RegExpPatternChar that);

    /** Process an instance of RegExpDot. */
    public abstract RetType forRegExpDot(RegExpDot that);

    /** Process an instance of RegExpDecimalEscape. */
    public abstract RetType forRegExpDecimalEscape(RegExpDecimalEscape that);

    /** Process an instance of RegExpControlEscape. */
    public abstract RetType forRegExpControlEscape(RegExpControlEscape that);

    /** Process an instance of RegExpControlLetter. */
    public abstract RetType forRegExpControlLetter(RegExpControlLetter that);

    /** Process an instance of RegExpHexEscapeSequence. */
    public abstract RetType forRegExpHexEscapeSequence(RegExpHexEscapeSequence that);

    /** Process an instance of RegExpUnicodeEscapeSequence. */
    public abstract RetType forRegExpUnicodeEscapeSequence(RegExpUnicodeEscapeSequence that);

    /** Process an instance of RegExpIdentityEscape. */
    public abstract RetType forRegExpIdentityEscape(RegExpIdentityEscape that);

    /** Process an instance of RegExpCharacterClassEscape. */
    public abstract RetType forRegExpCharacterClassEscape(RegExpCharacterClassEscape that);

    /** Process an instance of RegExpCharacterClassInclusion. */
    public abstract RetType forRegExpCharacterClassInclusion(RegExpCharacterClassInclusion that);

    /** Process an instance of RegExpCharacterClassExclusion. */
    public abstract RetType forRegExpCharacterClassExclusion(RegExpCharacterClassExclusion that);

    /** Process an instance of RegExpEmptyClassRanges. */
    public abstract RetType forRegExpEmptyClassRanges(RegExpEmptyClassRanges that);

    /** Process an instance of RegExpNonemptyClassRangesAtom. */
    public abstract RetType forRegExpNonemptyClassRangesAtom(RegExpNonemptyClassRangesAtom that);

    /** Process an instance of RegExpNonemptyClassRangesAtoms. */
    public abstract RetType forRegExpNonemptyClassRangesAtoms(RegExpNonemptyClassRangesAtoms that);

    /** Process an instance of RegExpNonemptyClassRangesDash. */
    public abstract RetType forRegExpNonemptyClassRangesDash(RegExpNonemptyClassRangesDash that);

    /** Process an instance of RegExpClassAtomDash. */
    public abstract RetType forRegExpClassAtomDash(RegExpClassAtomDash that);

    /** Process an instance of RegExpClassAtomNoDashCharacter. */
    public abstract RetType forRegExpClassAtomNoDashCharacter(RegExpClassAtomNoDashCharacter that);

    /** Process an instance of RegExpClassDecimalEscape. */
    public abstract RetType forRegExpClassDecimalEscape(RegExpClassDecimalEscape that);

    /** Process an instance of RegExpClassEscapeB. */
    public abstract RetType forRegExpClassEscapeB(RegExpClassEscapeB that);

    /** Process an instance of RegExpClassCharacterEscape. */
    public abstract RetType forRegExpClassCharacterEscape(RegExpClassCharacterEscape that);

    /** Process an instance of RegExpClassCharacterClassEscape. */
    public abstract RetType forRegExpClassCharacterClassEscape(RegExpClassCharacterClassEscape that);

    /** Process an instance of RegExpParen. */
    public abstract RetType forRegExpParen(RegExpParen that);

    /** Process an instance of RegExpParenOpt. */
    public abstract RetType forRegExpParenOpt(RegExpParenOpt that);

    /** Process an instance of RegExpAtomQuantifier. */
    public abstract RetType forRegExpAtomQuantifier(RegExpAtomQuantifier that);

    /** Process an instance of RegExpQuantifier. */
    public abstract RetType forRegExpQuantifier(RegExpQuantifier that);

    /** Process an instance of RegExpQuantifierStar. */
    public abstract RetType forRegExpQuantifierStar(RegExpQuantifierStar that);

    /** Process an instance of RegExpQuantifierPlus. */
    public abstract RetType forRegExpQuantifierPlus(RegExpQuantifierPlus that);

    /** Process an instance of RegExpQuantifierQuest. */
    public abstract RetType forRegExpQuantifierQuest(RegExpQuantifierQuest that);

    /** Process an instance of RegExpQuantifierNumber. */
    public abstract RetType forRegExpQuantifierNumber(RegExpQuantifierNumber that);

    /** Process an instance of RegExpCapturingParensInfo. */
    public abstract RetType forRegExpCapturingParensInfo(RegExpCapturingParensInfo that);

    /** Process an instance of RegExpClassRangesInfo. */
    public abstract RetType forRegExpClassRangesInfo(RegExpClassRangesInfo that);
}
