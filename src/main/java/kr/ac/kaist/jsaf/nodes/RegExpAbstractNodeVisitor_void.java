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

/** An interface for visitors over RegExpAbstractNode that do not return a value. */
@SuppressWarnings("unused")
public interface RegExpAbstractNodeVisitor_void {

    /** Process an instance of RegExpPattern. */
    public void forRegExpPattern(RegExpPattern that);

    /** Process an instance of RegExpBaseDisjunction. */
    public void forRegExpBaseDisjunction(RegExpBaseDisjunction that);

    /** Process an instance of RegExpConsDisjunction. */
    public void forRegExpConsDisjunction(RegExpConsDisjunction that);

    /** Process an instance of RegExpEmptyAlternative. */
    public void forRegExpEmptyAlternative(RegExpEmptyAlternative that);

    /** Process an instance of RegExpConsAlternative. */
    public void forRegExpConsAlternative(RegExpConsAlternative that);

    /** Process an instance of RegExpAssertionCaret. */
    public void forRegExpAssertionCaret(RegExpAssertionCaret that);

    /** Process an instance of RegExpAssertionDollar. */
    public void forRegExpAssertionDollar(RegExpAssertionDollar that);

    /** Process an instance of RegExpAssertionLowerCaseB. */
    public void forRegExpAssertionLowerCaseB(RegExpAssertionLowerCaseB that);

    /** Process an instance of RegExpAssertionUpperCaseB. */
    public void forRegExpAssertionUpperCaseB(RegExpAssertionUpperCaseB that);

    /** Process an instance of RegExpAssertionEqual. */
    public void forRegExpAssertionEqual(RegExpAssertionEqual that);

    /** Process an instance of RegExpAssertionExcla. */
    public void forRegExpAssertionExcla(RegExpAssertionExcla that);

    /** Process an instance of RegExpPatternChar. */
    public void forRegExpPatternChar(RegExpPatternChar that);

    /** Process an instance of RegExpDot. */
    public void forRegExpDot(RegExpDot that);

    /** Process an instance of RegExpDecimalEscape. */
    public void forRegExpDecimalEscape(RegExpDecimalEscape that);

    /** Process an instance of RegExpControlEscape. */
    public void forRegExpControlEscape(RegExpControlEscape that);

    /** Process an instance of RegExpControlLetter. */
    public void forRegExpControlLetter(RegExpControlLetter that);

    /** Process an instance of RegExpHexEscapeSequence. */
    public void forRegExpHexEscapeSequence(RegExpHexEscapeSequence that);

    /** Process an instance of RegExpUnicodeEscapeSequence. */
    public void forRegExpUnicodeEscapeSequence(RegExpUnicodeEscapeSequence that);

    /** Process an instance of RegExpIdentityEscape. */
    public void forRegExpIdentityEscape(RegExpIdentityEscape that);

    /** Process an instance of RegExpCharacterClassEscape. */
    public void forRegExpCharacterClassEscape(RegExpCharacterClassEscape that);

    /** Process an instance of RegExpCharacterClassInclusion. */
    public void forRegExpCharacterClassInclusion(RegExpCharacterClassInclusion that);

    /** Process an instance of RegExpCharacterClassExclusion. */
    public void forRegExpCharacterClassExclusion(RegExpCharacterClassExclusion that);

    /** Process an instance of RegExpEmptyClassRanges. */
    public void forRegExpEmptyClassRanges(RegExpEmptyClassRanges that);

    /** Process an instance of RegExpNonemptyClassRangesAtom. */
    public void forRegExpNonemptyClassRangesAtom(RegExpNonemptyClassRangesAtom that);

    /** Process an instance of RegExpNonemptyClassRangesAtoms. */
    public void forRegExpNonemptyClassRangesAtoms(RegExpNonemptyClassRangesAtoms that);

    /** Process an instance of RegExpNonemptyClassRangesDash. */
    public void forRegExpNonemptyClassRangesDash(RegExpNonemptyClassRangesDash that);

    /** Process an instance of RegExpClassAtomDash. */
    public void forRegExpClassAtomDash(RegExpClassAtomDash that);

    /** Process an instance of RegExpClassAtomNoDashCharacter. */
    public void forRegExpClassAtomNoDashCharacter(RegExpClassAtomNoDashCharacter that);

    /** Process an instance of RegExpClassDecimalEscape. */
    public void forRegExpClassDecimalEscape(RegExpClassDecimalEscape that);

    /** Process an instance of RegExpClassEscapeB. */
    public void forRegExpClassEscapeB(RegExpClassEscapeB that);

    /** Process an instance of RegExpClassCharacterEscape. */
    public void forRegExpClassCharacterEscape(RegExpClassCharacterEscape that);

    /** Process an instance of RegExpClassCharacterClassEscape. */
    public void forRegExpClassCharacterClassEscape(RegExpClassCharacterClassEscape that);

    /** Process an instance of RegExpParen. */
    public void forRegExpParen(RegExpParen that);

    /** Process an instance of RegExpParenOpt. */
    public void forRegExpParenOpt(RegExpParenOpt that);

    /** Process an instance of RegExpAtomQuantifier. */
    public void forRegExpAtomQuantifier(RegExpAtomQuantifier that);

    /** Process an instance of RegExpQuantifier. */
    public void forRegExpQuantifier(RegExpQuantifier that);

    /** Process an instance of RegExpQuantifierStar. */
    public void forRegExpQuantifierStar(RegExpQuantifierStar that);

    /** Process an instance of RegExpQuantifierPlus. */
    public void forRegExpQuantifierPlus(RegExpQuantifierPlus that);

    /** Process an instance of RegExpQuantifierQuest. */
    public void forRegExpQuantifierQuest(RegExpQuantifierQuest that);

    /** Process an instance of RegExpQuantifierNumber. */
    public void forRegExpQuantifierNumber(RegExpQuantifierNumber that);
}
