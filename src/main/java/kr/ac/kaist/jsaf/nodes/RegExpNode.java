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

@SuppressWarnings("unused")
public interface RegExpNode {

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor);

    public void accept(RegExpNodeVisitor_void visitor);

    public int generateHashCode();
    /** Generate a human-readable representation that can be deserialized. */
    public java.lang.String serialize();
    /** Generate a human-readable representation that can be deserialized. */
    public void serialize(java.io.Writer writer);
    public void walk(TreeWalker w);
}
