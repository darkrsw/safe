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

/** An abstract void visitor over RegExpNode that provides a Runnable1 run method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class RegExpNodeVisitorRunnable1 implements edu.rice.cs.plt.lambda.Runnable1<RegExpNode>, RegExpNodeVisitor_void {

    public void run(RegExpNode that) {
        that.accept(this);
    }


    /** Process an instance of RegExpPattern. */
    public abstract void forRegExpPattern(RegExpPattern that);

    /** Process an instance of RegExpBaseDisjunction. */
    public abstract void forRegExpBaseDisjunction(RegExpBaseDisjunction that);

    /** Process an instance of RegExpConsDisjunction. */
    public abstract void forRegExpConsDisjunction(RegExpConsDisjunction that);

    /** Process an instance of RegExpEmptyAlternative. */
    public abstract void forRegExpEmptyAlternative(RegExpEmptyAlternative that);

    /** Process an instance of RegExpConsAlternative. */
    public abstract void forRegExpConsAlternative(RegExpConsAlternative that);

    /** Process an instance of RegExpAssertionCaret. */
    public abstract void forRegExpAssertionCaret(RegExpAssertionCaret that);

    /** Process an instance of RegExpAssertionDollar. */
    public abstract void forRegExpAssertionDollar(RegExpAssertionDollar that);

    /** Process an instance of RegExpAssertionLowerCaseB. */
    public abstract void forRegExpAssertionLowerCaseB(RegExpAssertionLowerCaseB that);

    /** Process an instance of RegExpAssertionUpperCaseB. */
    public abstract void forRegExpAssertionUpperCaseB(RegExpAssertionUpperCaseB that);

    /** Process an instance of RegExpAssertionEqual. */
    public abstract void forRegExpAssertionEqual(RegExpAssertionEqual that);

    /** Process an instance of RegExpAssertionExcla. */
    public abstract void forRegExpAssertionExcla(RegExpAssertionExcla that);

    /** Process an instance of RegExpPatternChar. */
    public abstract void forRegExpPatternChar(RegExpPatternChar that);

    /** Process an instance of RegExpDot. */
    public abstract void forRegExpDot(RegExpDot that);

    /** Process an instance of RegExpDecimalEscape. */
    public abstract void forRegExpDecimalEscape(RegExpDecimalEscape that);

    /** Process an instance of RegExpControlEscape. */
    public abstract void forRegExpControlEscape(RegExpControlEscape that);

    /** Process an instance of RegExpControlLetter. */
    public abstract void forRegExpControlLetter(RegExpControlLetter that);

    /** Process an instance of RegExpHexEscapeSequence. */
    public abstract void forRegExpHexEscapeSequence(RegExpHexEscapeSequence that);

    /** Process an instance of RegExpUnicodeEscapeSequence. */
    public abstract void forRegExpUnicodeEscapeSequence(RegExpUnicodeEscapeSequence that);

    /** Process an instance of RegExpIdentityEscape. */
    public abstract void forRegExpIdentityEscape(RegExpIdentityEscape that);

    /** Process an instance of RegExpCharacterClassEscape. */
    public abstract void forRegExpCharacterClassEscape(RegExpCharacterClassEscape that);

    /** Process an instance of RegExpCharacterClassInclusion. */
    public abstract void forRegExpCharacterClassInclusion(RegExpCharacterClassInclusion that);

    /** Process an instance of RegExpCharacterClassExclusion. */
    public abstract void forRegExpCharacterClassExclusion(RegExpCharacterClassExclusion that);

    /** Process an instance of RegExpEmptyClassRanges. */
    public abstract void forRegExpEmptyClassRanges(RegExpEmptyClassRanges that);

    /** Process an instance of RegExpNonemptyClassRangesAtom. */
    public abstract void forRegExpNonemptyClassRangesAtom(RegExpNonemptyClassRangesAtom that);

    /** Process an instance of RegExpNonemptyClassRangesAtoms. */
    public abstract void forRegExpNonemptyClassRangesAtoms(RegExpNonemptyClassRangesAtoms that);

    /** Process an instance of RegExpNonemptyClassRangesDash. */
    public abstract void forRegExpNonemptyClassRangesDash(RegExpNonemptyClassRangesDash that);

    /** Process an instance of RegExpClassAtomDash. */
    public abstract void forRegExpClassAtomDash(RegExpClassAtomDash that);

    /** Process an instance of RegExpClassAtomNoDashCharacter. */
    public abstract void forRegExpClassAtomNoDashCharacter(RegExpClassAtomNoDashCharacter that);

    /** Process an instance of RegExpClassDecimalEscape. */
    public abstract void forRegExpClassDecimalEscape(RegExpClassDecimalEscape that);

    /** Process an instance of RegExpClassEscapeB. */
    public abstract void forRegExpClassEscapeB(RegExpClassEscapeB that);

    /** Process an instance of RegExpClassCharacterEscape. */
    public abstract void forRegExpClassCharacterEscape(RegExpClassCharacterEscape that);

    /** Process an instance of RegExpClassCharacterClassEscape. */
    public abstract void forRegExpClassCharacterClassEscape(RegExpClassCharacterClassEscape that);

    /** Process an instance of RegExpParen. */
    public abstract void forRegExpParen(RegExpParen that);

    /** Process an instance of RegExpParenOpt. */
    public abstract void forRegExpParenOpt(RegExpParenOpt that);

    /** Process an instance of RegExpAtomQuantifier. */
    public abstract void forRegExpAtomQuantifier(RegExpAtomQuantifier that);

    /** Process an instance of RegExpQuantifier. */
    public abstract void forRegExpQuantifier(RegExpQuantifier that);

    /** Process an instance of RegExpQuantifierStar. */
    public abstract void forRegExpQuantifierStar(RegExpQuantifierStar that);

    /** Process an instance of RegExpQuantifierPlus. */
    public abstract void forRegExpQuantifierPlus(RegExpQuantifierPlus that);

    /** Process an instance of RegExpQuantifierQuest. */
    public abstract void forRegExpQuantifierQuest(RegExpQuantifierQuest that);

    /** Process an instance of RegExpQuantifierNumber. */
    public abstract void forRegExpQuantifierNumber(RegExpQuantifierNumber that);

    /** Process an instance of RegExpCapturingParensInfo. */
    public abstract void forRegExpCapturingParensInfo(RegExpCapturingParensInfo that);

    /** Process an instance of RegExpClassRangesInfo. */
    public abstract void forRegExpClassRangesInfo(RegExpClassRangesInfo that);
}
