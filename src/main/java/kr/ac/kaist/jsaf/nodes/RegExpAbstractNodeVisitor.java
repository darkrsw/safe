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

/** A parametric interface for visitors over RegExpAbstractNode that return a value. */
@SuppressWarnings("unused")
public interface RegExpAbstractNodeVisitor<RetType> {

    /** Process an instance of RegExpPattern. */
    public RetType forRegExpPattern(RegExpPattern that);

    /** Process an instance of RegExpBaseDisjunction. */
    public RetType forRegExpBaseDisjunction(RegExpBaseDisjunction that);

    /** Process an instance of RegExpConsDisjunction. */
    public RetType forRegExpConsDisjunction(RegExpConsDisjunction that);

    /** Process an instance of RegExpEmptyAlternative. */
    public RetType forRegExpEmptyAlternative(RegExpEmptyAlternative that);

    /** Process an instance of RegExpConsAlternative. */
    public RetType forRegExpConsAlternative(RegExpConsAlternative that);

    /** Process an instance of RegExpAssertionCaret. */
    public RetType forRegExpAssertionCaret(RegExpAssertionCaret that);

    /** Process an instance of RegExpAssertionDollar. */
    public RetType forRegExpAssertionDollar(RegExpAssertionDollar that);

    /** Process an instance of RegExpAssertionLowerCaseB. */
    public RetType forRegExpAssertionLowerCaseB(RegExpAssertionLowerCaseB that);

    /** Process an instance of RegExpAssertionUpperCaseB. */
    public RetType forRegExpAssertionUpperCaseB(RegExpAssertionUpperCaseB that);

    /** Process an instance of RegExpAssertionEqual. */
    public RetType forRegExpAssertionEqual(RegExpAssertionEqual that);

    /** Process an instance of RegExpAssertionExcla. */
    public RetType forRegExpAssertionExcla(RegExpAssertionExcla that);

    /** Process an instance of RegExpPatternChar. */
    public RetType forRegExpPatternChar(RegExpPatternChar that);

    /** Process an instance of RegExpDot. */
    public RetType forRegExpDot(RegExpDot that);

    /** Process an instance of RegExpDecimalEscape. */
    public RetType forRegExpDecimalEscape(RegExpDecimalEscape that);

    /** Process an instance of RegExpControlEscape. */
    public RetType forRegExpControlEscape(RegExpControlEscape that);

    /** Process an instance of RegExpControlLetter. */
    public RetType forRegExpControlLetter(RegExpControlLetter that);

    /** Process an instance of RegExpHexEscapeSequence. */
    public RetType forRegExpHexEscapeSequence(RegExpHexEscapeSequence that);

    /** Process an instance of RegExpUnicodeEscapeSequence. */
    public RetType forRegExpUnicodeEscapeSequence(RegExpUnicodeEscapeSequence that);

    /** Process an instance of RegExpIdentityEscape. */
    public RetType forRegExpIdentityEscape(RegExpIdentityEscape that);

    /** Process an instance of RegExpCharacterClassEscape. */
    public RetType forRegExpCharacterClassEscape(RegExpCharacterClassEscape that);

    /** Process an instance of RegExpCharacterClassInclusion. */
    public RetType forRegExpCharacterClassInclusion(RegExpCharacterClassInclusion that);

    /** Process an instance of RegExpCharacterClassExclusion. */
    public RetType forRegExpCharacterClassExclusion(RegExpCharacterClassExclusion that);

    /** Process an instance of RegExpEmptyClassRanges. */
    public RetType forRegExpEmptyClassRanges(RegExpEmptyClassRanges that);

    /** Process an instance of RegExpNonemptyClassRangesAtom. */
    public RetType forRegExpNonemptyClassRangesAtom(RegExpNonemptyClassRangesAtom that);

    /** Process an instance of RegExpNonemptyClassRangesAtoms. */
    public RetType forRegExpNonemptyClassRangesAtoms(RegExpNonemptyClassRangesAtoms that);

    /** Process an instance of RegExpNonemptyClassRangesDash. */
    public RetType forRegExpNonemptyClassRangesDash(RegExpNonemptyClassRangesDash that);

    /** Process an instance of RegExpClassAtomDash. */
    public RetType forRegExpClassAtomDash(RegExpClassAtomDash that);

    /** Process an instance of RegExpClassAtomNoDashCharacter. */
    public RetType forRegExpClassAtomNoDashCharacter(RegExpClassAtomNoDashCharacter that);

    /** Process an instance of RegExpClassDecimalEscape. */
    public RetType forRegExpClassDecimalEscape(RegExpClassDecimalEscape that);

    /** Process an instance of RegExpClassEscapeB. */
    public RetType forRegExpClassEscapeB(RegExpClassEscapeB that);

    /** Process an instance of RegExpClassCharacterEscape. */
    public RetType forRegExpClassCharacterEscape(RegExpClassCharacterEscape that);

    /** Process an instance of RegExpClassCharacterClassEscape. */
    public RetType forRegExpClassCharacterClassEscape(RegExpClassCharacterClassEscape that);

    /** Process an instance of RegExpParen. */
    public RetType forRegExpParen(RegExpParen that);

    /** Process an instance of RegExpParenOpt. */
    public RetType forRegExpParenOpt(RegExpParenOpt that);

    /** Process an instance of RegExpAtomQuantifier. */
    public RetType forRegExpAtomQuantifier(RegExpAtomQuantifier that);

    /** Process an instance of RegExpQuantifier. */
    public RetType forRegExpQuantifier(RegExpQuantifier that);

    /** Process an instance of RegExpQuantifierStar. */
    public RetType forRegExpQuantifierStar(RegExpQuantifierStar that);

    /** Process an instance of RegExpQuantifierPlus. */
    public RetType forRegExpQuantifierPlus(RegExpQuantifierPlus that);

    /** Process an instance of RegExpQuantifierQuest. */
    public RetType forRegExpQuantifierQuest(RegExpQuantifierQuest that);

    /** Process an instance of RegExpQuantifierNumber. */
    public RetType forRegExpQuantifierNumber(RegExpQuantifierNumber that);
}
