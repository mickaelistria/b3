package org.eclipse.b3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBeeLangLexer extends Lexer {
    public static final int T114=114;
    public static final int T115=115;
    public static final int T116=116;
    public static final int RULE_ID=4;
    public static final int T117=117;
    public static final int T118=118;
    public static final int T119=119;
    public static final int RULE_ANY_OTHER=20;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int RULE_SIMPLE_PATTERN=8;
    public static final int T26=26;
    public static final int T25=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int T120=120;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T122=122;
    public static final int T21=21;
    public static final int T121=121;
    public static final int T124=124;
    public static final int T123=123;
    public static final int T127=127;
    public static final int T128=128;
    public static final int T125=125;
    public static final int T126=126;
    public static final int RULE_HEX=10;
    public static final int T129=129;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T131=131;
    public static final int T34=34;
    public static final int T130=130;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T135=135;
    public static final int T30=30;
    public static final int RULE_TEXTSTART=14;
    public static final int T134=134;
    public static final int T133=133;
    public static final int T32=32;
    public static final int T132=132;
    public static final int T31=31;
    public static final int RULE_PID=6;
    public static final int T49=49;
    public static final int T48=48;
    public static final int RULE_TEXT=11;
    public static final int T100=100;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T102=102;
    public static final int T41=41;
    public static final int T101=101;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int RULE_ML_COMMENT=17;
    public static final int T45=45;
    public static final int T44=44;
    public static final int T109=109;
    public static final int T107=107;
    public static final int T108=108;
    public static final int RULE_STRING=5;
    public static final int T105=105;
    public static final int T106=106;
    public static final int T103=103;
    public static final int T104=104;
    public static final int T50=50;
    public static final int RULE_TEXTMID=15;
    public static final int T59=59;
    public static final int T113=113;
    public static final int T52=52;
    public static final int T112=112;
    public static final int T51=51;
    public static final int T111=111;
    public static final int T54=54;
    public static final int T110=110;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_EXT_INT=12;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int T159=159;
    public static final int T158=158;
    public static final int T161=161;
    public static final int T162=162;
    public static final int T163=163;
    public static final int T164=164;
    public static final int T165=165;
    public static final int T166=166;
    public static final int T167=167;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T160=160;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_JAVADOC=13;
    public static final int RULE_INT=9;
    public static final int T61=61;
    public static final int T60=60;
    public static final int RULE_REGULAR_EXPR=7;
    public static final int T99=99;
    public static final int T97=97;
    public static final int T98=98;
    public static final int T95=95;
    public static final int T96=96;
    public static final int T137=137;
    public static final int RULE_TEXTEND=16;
    public static final int T136=136;
    public static final int T139=139;
    public static final int T138=138;
    public static final int T143=143;
    public static final int T144=144;
    public static final int T145=145;
    public static final int T146=146;
    public static final int T140=140;
    public static final int T141=141;
    public static final int T142=142;
    public static final int T94=94;
    public static final int Tokens=168;
    public static final int T93=93;
    public static final int RULE_SL_COMMENT=18;
    public static final int T92=92;
    public static final int T91=91;
    public static final int T90=90;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int T149=149;
    public static final int T148=148;
    public static final int T147=147;
    public static final int T156=156;
    public static final int T157=157;
    public static final int T154=154;
    public static final int T155=155;
    public static final int T152=152;
    public static final int T153=153;
    public static final int T150=150;
    public static final int T151=151;
    public static final int RULE_WS=19;
    public static final int T81=81;
    public static final int T80=80;
    public static final int T83=83;
    public static final int T82=82;
    public InternalBeeLangLexer() {;} 
    public InternalBeeLangLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g"; }

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:10:5: ( 'reexport' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:10:7: 'reexport'
            {
            match("reexport"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:11:5: ( 'use' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:11:7: 'use'
            {
            match("use"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:12:5: ( 'as' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:12:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:13:5: ( ';' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:13:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:14:5: ( 'unit' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:14:7: 'unit'
            {
            match("unit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:15:5: ( 'version' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:15:7: 'version'
            {
            match("version"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:16:5: ( 'is' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:16:7: 'is'
            {
            match("is"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:17:5: ( ',' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:17:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:18:5: ( '{' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:18:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:19:5: ( 'source' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:19:7: 'source'
            {
            match("source"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:20:5: ( ':' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:20:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:21:5: ( 'output' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:21:7: 'output'
            {
            match("output"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:22:5: ( 'provides' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:22:7: 'provides'
            {
            match("provides"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:23:5: ( '[' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:23:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24:5: ( ']' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:25:5: ( 'requires' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:25:7: 'requires'
            {
            match("requires"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:26:5: ( 'select-required' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:26:7: 'select-required'
            {
            match("select-required"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:27:5: ( 'env' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:27:7: 'env'
            {
            match("env"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:28:5: ( 'platform-filter' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:28:7: 'platform-filter'
            {
            match("platform-filter"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:29:5: ( '}' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:29:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:30:5: ( 'fragment-host' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:30:7: 'fragment-host'
            {
            match("fragment-host"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:31:5: ( 'capability' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:31:7: 'capability'
            {
            match("capability"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:32:5: ( 'when' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:32:7: 'when'
            {
            match("when"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:33:5: ( 'name' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:33:7: 'name'
            {
            match("name"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:34:5: ( 'name-space' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:34:7: 'name-space'
            {
            match("name-space"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:35:5: ( 'greedy' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:35:7: 'greedy'
            {
            match("greedy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:36:5: ( 'requires-min' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:36:7: 'requires-min'
            {
            match("requires-min"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:37:5: ( 'requires-max' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:37:7: 'requires-max'
            {
            match("requires-max"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:38:5: ( 'properties' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:38:7: 'properties'
            {
            match("properties"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:39:5: ( 'extends' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:39:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:40:5: ( 'load-from' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:40:7: 'load-from'
            {
            match("load-from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:41:5: ( 'default-properties' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:41:7: 'default-properties'
            {
            match("default-properties"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:42:5: ( '(' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:42:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:43:5: ( ')' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:43:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:44:5: ( 'final' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:44:7: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:45:5: ( '=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:45:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:46:5: ( 'mutable' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:46:7: 'mutable'
            {
            match("mutable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:47:5: ( 'sequential' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:47:7: 'sequential'
            {
            match("sequential"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:48:5: ( 'builder' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:48:7: 'builder'
            {
            match("builder"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:49:5: ( 'annotations' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:49:7: 'annotations'
            {
            match("annotations"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:50:5: ( '/' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:50:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:51:5: ( 'with' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:51:7: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:52:5: ( 'concern' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:52:7: 'concern'
            {
            match("concern"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:53:5: ( '.' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:53:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:54:5: ( '...' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:54:7: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:55:5: ( '@precondition' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:55:7: '@precondition'
            {
            match("@precondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:56:5: ( '@postcondition' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:56:7: '@postcondition'
            {
            match("@postcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:57:5: ( 'input' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:57:7: 'input'
            {
            match("input"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:58:5: ( '@postinputcondition' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:58:7: '@postinputcondition'
            {
            match("@postinputcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:59:5: ( 'result' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:59:7: 'result'
            {
            match("result"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:60:5: ( 'val' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:60:7: 'val'
            {
            match("val"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:61:5: ( 'repository' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:61:7: 'repository'
            {
            match("repository"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:62:5: ( 'connection' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:62:7: 'connection'
            {
            match("connection"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:63:5: ( 'branches' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:63:7: 'branches'
            {
            match("branches"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:64:5: ( 'true' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:64:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:65:5: ( 'false' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:65:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:66:5: ( 'default' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:66:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:67:5: ( 'branch' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:67:7: 'branch'
            {
            match("branch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:68:5: ( 'policy' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:68:7: 'policy'
            {
            match("policy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:69:5: ( 'checkout-content' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:69:7: 'checkout-content'
            {
            match("checkout-content"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:70:5: ( 'accept-dirty' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:70:7: 'accept-dirty'
            {
            match("accept-dirty"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:71:5: ( 'update-content' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:71:7: 'update-content'
            {
            match("update-content"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:72:5: ( 'on-merge-conflict' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:72:7: 'on-merge-conflict'
            {
            match("on-merge-conflict"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:73:5: ( 'replace-content' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:73:7: 'replace-content'
            {
            match("replace-content"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:74:5: ( 'exclude' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:74:7: 'exclude'
            {
            match("exclude"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:75:5: ( 'include' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:75:7: 'include'
            {
            match("include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:76:5: ( 'resolution' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:76:7: 'resolution'
            {
            match("resolution"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:77:5: ( 'select-first' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:77:7: 'select-first'
            {
            match("select-first"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:78:5: ( 'select-best' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:78:7: 'select-best'
            {
            match("select-best"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:79:5: ( 'select-switch' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:79:7: 'select-switch'
            {
            match("select-switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:80:5: ( 'endswitch' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:80:7: 'endswitch'
            {
            match("endswitch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:81:5: ( 'case' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:81:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:82:5: ( 'container' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:82:7: 'container'
            {
            match("container"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:83:5: ( 'function' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:83:7: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:84:5: ( '+=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:84:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:85:5: ( '-=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:85:7: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:86:5: ( '*=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:86:7: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:87:5: ( '/=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:87:7: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:88:5: ( '%=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:88:7: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:89:6: ( '~=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:89:8: '~='
            {
            match("~="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start T101
    public final void mT101() throws RecognitionException {
        try {
            int _type = T101;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:90:6: ( '==' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:90:8: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T101

    // $ANTLR start T102
    public final void mT102() throws RecognitionException {
        try {
            int _type = T102;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:91:6: ( '===' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:91:8: '==='
            {
            match("==="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T102

    // $ANTLR start T103
    public final void mT103() throws RecognitionException {
        try {
            int _type = T103;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:92:6: ( '!=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:92:8: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T103

    // $ANTLR start T104
    public final void mT104() throws RecognitionException {
        try {
            int _type = T104;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:93:6: ( '!==' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:93:8: '!=='
            {
            match("!=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T104

    // $ANTLR start T105
    public final void mT105() throws RecognitionException {
        try {
            int _type = T105;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:94:6: ( '!~' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:94:8: '!~'
            {
            match("!~"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T105

    // $ANTLR start T106
    public final void mT106() throws RecognitionException {
        try {
            int _type = T106;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:95:6: ( '>=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:95:8: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T106

    // $ANTLR start T107
    public final void mT107() throws RecognitionException {
        try {
            int _type = T107;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:96:6: ( '<=' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:96:8: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T107

    // $ANTLR start T108
    public final void mT108() throws RecognitionException {
        try {
            int _type = T108;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:97:6: ( '>' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:97:8: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T108

    // $ANTLR start T109
    public final void mT109() throws RecognitionException {
        try {
            int _type = T109;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:98:6: ( '<' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:98:8: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start T110
    public final void mT110() throws RecognitionException {
        try {
            int _type = T110;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:99:6: ( 'var' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:99:8: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T110

    // $ANTLR start T111
    public final void mT111() throws RecognitionException {
        try {
            int _type = T111;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:100:6: ( '=>' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:100:8: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T111

    // $ANTLR start T112
    public final void mT112() throws RecognitionException {
        try {
            int _type = T112;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:101:6: ( '?' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:101:8: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T112

    // $ANTLR start T113
    public final void mT113() throws RecognitionException {
        try {
            int _type = T113;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:102:6: ( 'super' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:102:8: 'super'
            {
            match("super"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T113

    // $ANTLR start T114
    public final void mT114() throws RecognitionException {
        try {
            int _type = T114;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:103:6: ( 'cached' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:103:8: 'cached'
            {
            match("cached"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T114

    // $ANTLR start T115
    public final void mT115() throws RecognitionException {
        try {
            int _type = T115;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:104:6: ( '||' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:104:8: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T115

    // $ANTLR start T116
    public final void mT116() throws RecognitionException {
        try {
            int _type = T116;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:105:6: ( '&&' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:105:8: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T116

    // $ANTLR start T117
    public final void mT117() throws RecognitionException {
        try {
            int _type = T117;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:106:6: ( 'instanceof' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:106:8: 'instanceof'
            {
            match("instanceof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T117

    // $ANTLR start T118
    public final void mT118() throws RecognitionException {
        try {
            int _type = T118;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:107:6: ( '+' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:107:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T118

    // $ANTLR start T119
    public final void mT119() throws RecognitionException {
        try {
            int _type = T119;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:108:6: ( '-' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:108:8: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T119

    // $ANTLR start T120
    public final void mT120() throws RecognitionException {
        try {
            int _type = T120;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:109:6: ( '*' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:109:8: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T120

    // $ANTLR start T121
    public final void mT121() throws RecognitionException {
        try {
            int _type = T121;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:110:6: ( '%' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:110:8: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T121

    // $ANTLR start T122
    public final void mT122() throws RecognitionException {
        try {
            int _type = T122;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:111:6: ( '..' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:111:8: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T122

    // $ANTLR start T123
    public final void mT123() throws RecognitionException {
        try {
            int _type = T123;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:112:6: ( '!' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:112:8: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T123

    // $ANTLR start T124
    public final void mT124() throws RecognitionException {
        try {
            int _type = T124;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:113:6: ( '++' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:113:8: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T124

    // $ANTLR start T125
    public final void mT125() throws RecognitionException {
        try {
            int _type = T125;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:114:6: ( '--' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:114:8: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T125

    // $ANTLR start T126
    public final void mT126() throws RecognitionException {
        try {
            int _type = T126;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:115:6: ( 'context' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:115:8: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T126

    // $ANTLR start T127
    public final void mT127() throws RecognitionException {
        try {
            int _type = T127;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:116:6: ( 'proceed' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:116:8: 'proceed'
            {
            match("proceed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T127

    // $ANTLR start T128
    public final void mT128() throws RecognitionException {
        try {
            int _type = T128;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:117:6: ( '_' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:117:8: '_'
            {
            match('_'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T128

    // $ANTLR start T129
    public final void mT129() throws RecognitionException {
        try {
            int _type = T129;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:118:6: ( 'throw' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:118:8: 'throw'
            {
            match("throw"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T129

    // $ANTLR start T130
    public final void mT130() throws RecognitionException {
        try {
            int _type = T130;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:119:6: ( 'try' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:119:8: 'try'
            {
            match("try"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T130

    // $ANTLR start T131
    public final void mT131() throws RecognitionException {
        try {
            int _type = T131;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:120:6: ( 'finally' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:120:8: 'finally'
            {
            match("finally"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T131

    // $ANTLR start T132
    public final void mT132() throws RecognitionException {
        try {
            int _type = T132;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:121:6: ( 'endtry' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:121:8: 'endtry'
            {
            match("endtry"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T132

    // $ANTLR start T133
    public final void mT133() throws RecognitionException {
        try {
            int _type = T133;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:122:6: ( 'catch' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:122:8: 'catch'
            {
            match("catch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T133

    // $ANTLR start T134
    public final void mT134() throws RecognitionException {
        try {
            int _type = T134;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:123:6: ( 'switch' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:123:8: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T134

    // $ANTLR start T135
    public final void mT135() throws RecognitionException {
        try {
            int _type = T135;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:124:6: ( 'if' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:124:8: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T135

    // $ANTLR start T136
    public final void mT136() throws RecognitionException {
        try {
            int _type = T136;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:125:6: ( 'then' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:125:8: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T136

    // $ANTLR start T137
    public final void mT137() throws RecognitionException {
        try {
            int _type = T137;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:126:6: ( 'else' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:126:8: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T137

    // $ANTLR start T138
    public final void mT138() throws RecognitionException {
        try {
            int _type = T138;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:127:6: ( 'endif' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:127:8: 'endif'
            {
            match("endif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T138

    // $ANTLR start T139
    public final void mT139() throws RecognitionException {
        try {
            int _type = T139;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:128:6: ( 'elseif' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:128:8: 'elseif'
            {
            match("elseif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T139

    // $ANTLR start T140
    public final void mT140() throws RecognitionException {
        try {
            int _type = T140;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:129:6: ( 'this' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:129:8: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T140

    // $ANTLR start T141
    public final void mT141() throws RecognitionException {
        try {
            int _type = T141;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:130:6: ( 'modify' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:130:8: 'modify'
            {
            match("modify"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T141

    // $ANTLR start T142
    public final void mT142() throws RecognitionException {
        try {
            int _type = T142;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:131:6: ( 'new' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:131:8: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T142

    // $ANTLR start T143
    public final void mT143() throws RecognitionException {
        try {
            int _type = T143;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:132:6: ( 'unit-context' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:132:8: 'unit-context'
            {
            match("unit-context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T143

    // $ANTLR start T144
    public final void mT144() throws RecognitionException {
        try {
            int _type = T144;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:133:6: ( 'select-units' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:133:8: 'select-units'
            {
            match("select-units"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T144

    // $ANTLR start T145
    public final void mT145() throws RecognitionException {
        try {
            int _type = T145;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:134:6: ( 'modify-selected' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:134:8: 'modify-selected'
            {
            match("modify-selected"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T145

    // $ANTLR start T146
    public final void mT146() throws RecognitionException {
        try {
            int _type = T146;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:135:6: ( 'builder-context' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:135:8: 'builder-context'
            {
            match("builder-context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T146

    // $ANTLR start T147
    public final void mT147() throws RecognitionException {
        try {
            int _type = T147;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:136:6: ( 'select-builders' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:136:8: 'select-builders'
            {
            match("select-builders"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T147

    // $ANTLR start T148
    public final void mT148() throws RecognitionException {
        try {
            int _type = T148;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:137:6: ( 'having-parameters' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:137:8: 'having-parameters'
            {
            match("having-parameters"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T148

    // $ANTLR start T149
    public final void mT149() throws RecognitionException {
        try {
            int _type = T149;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:138:6: ( 'conditions' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:138:8: 'conditions'
            {
            match("conditions"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T149

    // $ANTLR start T150
    public final void mT150() throws RecognitionException {
        try {
            int _type = T150;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:139:6: ( 'precondition' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:139:8: 'precondition'
            {
            match("precondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T150

    // $ANTLR start T151
    public final void mT151() throws RecognitionException {
        try {
            int _type = T151;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:140:6: ( 'postinputcondition' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:140:8: 'postinputcondition'
            {
            match("postinputcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T151

    // $ANTLR start T152
    public final void mT152() throws RecognitionException {
        try {
            int _type = T152;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:141:6: ( 'postcondition' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:141:8: 'postcondition'
            {
            match("postcondition"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T152

    // $ANTLR start T153
    public final void mT153() throws RecognitionException {
        try {
            int _type = T153;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:142:6: ( 'called-builder' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:142:8: 'called-builder'
            {
            match("called-builder"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T153

    // $ANTLR start T154
    public final void mT154() throws RecognitionException {
        try {
            int _type = T154;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:143:6: ( '|' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:143:8: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T154

    // $ANTLR start T155
    public final void mT155() throws RecognitionException {
        try {
            int _type = T155;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:144:6: ( 'null' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:144:8: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T155

    // $ANTLR start T156
    public final void mT156() throws RecognitionException {
        try {
            int _type = T156;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:145:6: ( '@' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:145:8: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T156

    // $ANTLR start T157
    public final void mT157() throws RecognitionException {
        try {
            int _type = T157;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:146:6: ( '$' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:146:8: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T157

    // $ANTLR start T158
    public final void mT158() throws RecognitionException {
        try {
            int _type = T158;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:147:6: ( '&' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:147:8: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T158

    // $ANTLR start T159
    public final void mT159() throws RecognitionException {
        try {
            int _type = T159;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:148:6: ( '#[' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:148:8: '#['
            {
            match("#["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T159

    // $ANTLR start T160
    public final void mT160() throws RecognitionException {
        try {
            int _type = T160;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:149:6: ( '##[' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:149:8: '##['
            {
            match("##["); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T160

    // $ANTLR start T161
    public final void mT161() throws RecognitionException {
        try {
            int _type = T161;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:150:6: ( 'latest' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:150:8: 'latest'
            {
            match("latest"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T161

    // $ANTLR start T162
    public final void mT162() throws RecognitionException {
        try {
            int _type = T162;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:151:6: ( 'revision' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:151:8: 'revision'
            {
            match("revision"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T162

    // $ANTLR start T163
    public final void mT163() throws RecognitionException {
        try {
            int _type = T163;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:152:6: ( 'tag' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:152:8: 'tag'
            {
            match("tag"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T163

    // $ANTLR start T164
    public final void mT164() throws RecognitionException {
        try {
            int _type = T164;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:153:6: ( 'timestamp' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:153:8: 'timestamp'
            {
            match("timestamp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T164

    // $ANTLR start T165
    public final void mT165() throws RecognitionException {
        try {
            int _type = T165;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:154:6: ( 'public' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:154:8: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T165

    // $ANTLR start T166
    public final void mT166() throws RecognitionException {
        try {
            int _type = T166;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:155:6: ( 'private' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:155:8: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T166

    // $ANTLR start T167
    public final void mT167() throws RecognitionException {
        try {
            int _type = T167;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:156:6: ( 'parallel' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:156:8: 'parallel'
            {
            match("parallel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T167

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24406:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24406:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24406:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24406:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24406:40: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_PID
    public final void mRULE_PID() throws RecognitionException {
        try {
            int _type = RULE_PID;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24408:10: ( '$' '{' RULE_ID ( '.' RULE_ID )* '}' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24408:12: '$' '{' RULE_ID ( '.' RULE_ID )* '}'
            {
            match('$'); 
            match('{'); 
            mRULE_ID(); 
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24408:28: ( '.' RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='.') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24408:29: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_PID

    // $ANTLR start RULE_REGULAR_EXPR
    public final void mRULE_REGULAR_EXPR() throws RecognitionException {
        try {
            int _type = RULE_REGULAR_EXPR;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24410:19: ( '~/' ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )* '/' ( 'u' | 'm' | 'i' | 'c' | 'd' )* )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24410:21: '~/' ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )* '/' ( 'u' | 'm' | 'i' | 'c' | 'd' )*
            {
            match("~/"); 

            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24410:26: ( '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) ) | ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\b')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\u001F')||(LA4_0>='!' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24410:27: '\\\\' ~ ( ( '\\t' | '\\r' | '\\n' ) )
            	    {
            	    match('\\'); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24410:52: ~ ( ( '\\\\' | '/' | ' ' | '\\t' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('/'); 
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24410:91: ( 'u' | 'm' | 'i' | 'c' | 'd' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='c' && LA5_0<='d')||LA5_0=='i'||LA5_0=='m'||LA5_0=='u') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:
            	    {
            	    if ( (input.LA(1)>='c' && input.LA(1)<='d')||input.LA(1)=='i'||input.LA(1)=='m'||input.LA(1)=='u' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REGULAR_EXPR

    // $ANTLR start RULE_SIMPLE_PATTERN
    public final void mRULE_SIMPLE_PATTERN() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_PATTERN;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24412:21: ( '~' RULE_STRING )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24412:23: '~' RULE_STRING
            {
            match('~'); 
            mRULE_STRING(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SIMPLE_PATTERN

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' ) )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            {
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("24414:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='0'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u')||input.LA(1)=='x' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:74: ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:104: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:109: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:110: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | 'x' | '0' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='0'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u')||input.LA(1)=='x' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24414:163: ~ ( ( '\\\\' | '\\'' | '\\r' | '\\n' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_TEXT
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24416:11: ( '\\u00AB' ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24416:13: '\\u00AB' ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB'
            {
            match('\u00AB'); 
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24416:22: ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='}'||LA10_0=='\u00AB') ) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='|')||(LA10_0>='~' && LA10_0<='\u00AA')||(LA10_0>='\u00AC' && LA10_0<='\u00BA')||(LA10_0>='\u00BC' && LA10_0<='\uFFFE')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24416:23: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )
            	    {
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24416:23: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0=='}') ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0=='\u00AB') ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("24416:23: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24416:24: '}' ~ ( '\\u00BB' )
            	            {
            	            match('}'); 
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse =
            	                    new MismatchedSetException(null,input);
            	                recover(mse);    throw mse;
            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24416:40: '\\u00AB' ~ ( '{' )
            	            {
            	            match('\u00AB'); 
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFE') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse =
            	                    new MismatchedSetException(null,input);
            	                recover(mse);    throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24416:57: ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\u00BB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_TEXT

    // $ANTLR start RULE_TEXTSTART
    public final void mRULE_TEXTSTART() throws RecognitionException {
        try {
            int _type = RULE_TEXTSTART;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24418:16: ( '\\u00AB' ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00AB' '{' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24418:18: '\\u00AB' ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00AB' '{'
            {
            match('\u00AB'); 
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24418:27: ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\u00AB') ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>='\u0000' && LA12_1<='z')||(LA12_1>='|' && LA12_1<='\uFFFE')) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0=='}') ) {
                    alt12=1;
                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='|')||(LA12_0>='~' && LA12_0<='\u00AA')||(LA12_0>='\u00AC' && LA12_0<='\u00BA')||(LA12_0>='\u00BC' && LA12_0<='\uFFFE')) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24418:28: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )
            	    {
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24418:28: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0=='}') ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0=='\u00AB') ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("24418:28: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24418:29: '}' ~ ( '\\u00BB' )
            	            {
            	            match('}'); 
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse =
            	                    new MismatchedSetException(null,input);
            	                recover(mse);    throw mse;
            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24418:45: '\\u00AB' ~ ( '{' )
            	            {
            	            match('\u00AB'); 
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFE') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse =
            	                    new MismatchedSetException(null,input);
            	                recover(mse);    throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24418:62: ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match('\u00AB'); 
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_TEXTSTART

    // $ANTLR start RULE_TEXTEND
    public final void mRULE_TEXTEND() throws RecognitionException {
        try {
            int _type = RULE_TEXTEND;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24420:14: ( '}' '\\u00BB' ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24420:16: '}' '\\u00BB' ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00BB'
            {
            match('}'); 
            match('\u00BB'); 
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24420:29: ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='}'||LA14_0=='\u00AB') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='|')||(LA14_0>='~' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\u00BA')||(LA14_0>='\u00BC' && LA14_0<='\uFFFE')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24420:30: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )
            	    {
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24420:30: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='}') ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0=='\u00AB') ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("24420:30: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24420:31: '}' ~ ( '\\u00BB' )
            	            {
            	            match('}'); 
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse =
            	                    new MismatchedSetException(null,input);
            	                recover(mse);    throw mse;
            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24420:47: '\\u00AB' ~ ( '{' )
            	            {
            	            match('\u00AB'); 
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFE') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse =
            	                    new MismatchedSetException(null,input);
            	                recover(mse);    throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24420:64: ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\u00BB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_TEXTEND

    // $ANTLR start RULE_TEXTMID
    public final void mRULE_TEXTMID() throws RecognitionException {
        try {
            int _type = RULE_TEXTMID;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24422:14: ( '}' '\\u00BB' ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00AB' '{' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24422:16: '}' '\\u00BB' ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )* '\\u00AB' '{'
            {
            match('}'); 
            match('\u00BB'); 
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24422:29: ( ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) ) | ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\u00AB') ) {
                    int LA16_1 = input.LA(2);

                    if ( ((LA16_1>='\u0000' && LA16_1<='z')||(LA16_1>='|' && LA16_1<='\uFFFE')) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0=='}') ) {
                    alt16=1;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='|')||(LA16_0>='~' && LA16_0<='\u00AA')||(LA16_0>='\u00AC' && LA16_0<='\u00BA')||(LA16_0>='\u00BC' && LA16_0<='\uFFFE')) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24422:30: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )
            	    {
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24422:30: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0=='}') ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0=='\u00AB') ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("24422:30: ( '}' ~ ( '\\u00BB' ) | '\\u00AB' ~ ( '{' ) )", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24422:31: '}' ~ ( '\\u00BB' )
            	            {
            	            match('}'); 
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse =
            	                    new MismatchedSetException(null,input);
            	                recover(mse);    throw mse;
            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24422:47: '\\u00AB' ~ ( '{' )
            	            {
            	            match('\u00AB'); 
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFE') ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse =
            	                    new MismatchedSetException(null,input);
            	                recover(mse);    throw mse;
            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24422:64: ~ ( ( '}' | '\\u00AB' | '\\u00BB' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match('\u00AB'); 
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_TEXTMID

    // $ANTLR start RULE_JAVADOC
    public final void mRULE_JAVADOC() throws RecognitionException {
        try {
            int _type = RULE_JAVADOC;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24424:14: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24424:16: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24424:22: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFE')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFE')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24424:50: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_JAVADOC

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24426:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24426:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24426:31: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFE')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFE')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24426:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24428:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24428:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24428:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFE')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24428:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24428:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24428:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24428:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24428:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24430:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24430:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24430:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_HEX
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24432:10: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24432:12: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24432:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='F')||(LA23_0>='a' && LA23_0<='f')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_HEX

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24434:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24434:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24434:12: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24434:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_EXT_INT
    public final void mRULE_EXT_INT() throws RecognitionException {
        try {
            int _type = RULE_EXT_INT;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24436:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24436:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
            {
            mRULE_INT(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            mRULE_INT(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_EXT_INT

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24438:16: ( . )
            // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:24438:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:8: ( T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | T140 | T141 | T142 | T143 | T144 | T145 | T146 | T147 | T148 | T149 | T150 | T151 | T152 | T153 | T154 | T155 | T156 | T157 | T158 | T159 | T160 | T161 | T162 | T163 | T164 | T165 | T166 | T167 | RULE_ID | RULE_PID | RULE_REGULAR_EXPR | RULE_SIMPLE_PATTERN | RULE_STRING | RULE_TEXT | RULE_TEXTSTART | RULE_TEXTEND | RULE_TEXTMID | RULE_JAVADOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_HEX | RULE_INT | RULE_EXT_INT | RULE_ANY_OTHER )
        int alt25=164;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:10: T21
                {
                mT21(); 

                }
                break;
            case 2 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:14: T22
                {
                mT22(); 

                }
                break;
            case 3 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:18: T23
                {
                mT23(); 

                }
                break;
            case 4 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:22: T24
                {
                mT24(); 

                }
                break;
            case 5 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:26: T25
                {
                mT25(); 

                }
                break;
            case 6 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:30: T26
                {
                mT26(); 

                }
                break;
            case 7 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:34: T27
                {
                mT27(); 

                }
                break;
            case 8 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:38: T28
                {
                mT28(); 

                }
                break;
            case 9 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:42: T29
                {
                mT29(); 

                }
                break;
            case 10 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:46: T30
                {
                mT30(); 

                }
                break;
            case 11 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:50: T31
                {
                mT31(); 

                }
                break;
            case 12 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:54: T32
                {
                mT32(); 

                }
                break;
            case 13 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:58: T33
                {
                mT33(); 

                }
                break;
            case 14 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:62: T34
                {
                mT34(); 

                }
                break;
            case 15 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:66: T35
                {
                mT35(); 

                }
                break;
            case 16 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:70: T36
                {
                mT36(); 

                }
                break;
            case 17 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:74: T37
                {
                mT37(); 

                }
                break;
            case 18 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:78: T38
                {
                mT38(); 

                }
                break;
            case 19 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:82: T39
                {
                mT39(); 

                }
                break;
            case 20 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:86: T40
                {
                mT40(); 

                }
                break;
            case 21 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:90: T41
                {
                mT41(); 

                }
                break;
            case 22 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:94: T42
                {
                mT42(); 

                }
                break;
            case 23 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:98: T43
                {
                mT43(); 

                }
                break;
            case 24 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:102: T44
                {
                mT44(); 

                }
                break;
            case 25 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:106: T45
                {
                mT45(); 

                }
                break;
            case 26 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:110: T46
                {
                mT46(); 

                }
                break;
            case 27 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:114: T47
                {
                mT47(); 

                }
                break;
            case 28 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:118: T48
                {
                mT48(); 

                }
                break;
            case 29 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:122: T49
                {
                mT49(); 

                }
                break;
            case 30 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:126: T50
                {
                mT50(); 

                }
                break;
            case 31 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:130: T51
                {
                mT51(); 

                }
                break;
            case 32 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:134: T52
                {
                mT52(); 

                }
                break;
            case 33 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:138: T53
                {
                mT53(); 

                }
                break;
            case 34 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:142: T54
                {
                mT54(); 

                }
                break;
            case 35 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:146: T55
                {
                mT55(); 

                }
                break;
            case 36 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:150: T56
                {
                mT56(); 

                }
                break;
            case 37 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:154: T57
                {
                mT57(); 

                }
                break;
            case 38 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:158: T58
                {
                mT58(); 

                }
                break;
            case 39 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:162: T59
                {
                mT59(); 

                }
                break;
            case 40 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:166: T60
                {
                mT60(); 

                }
                break;
            case 41 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:170: T61
                {
                mT61(); 

                }
                break;
            case 42 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:174: T62
                {
                mT62(); 

                }
                break;
            case 43 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:178: T63
                {
                mT63(); 

                }
                break;
            case 44 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:182: T64
                {
                mT64(); 

                }
                break;
            case 45 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:186: T65
                {
                mT65(); 

                }
                break;
            case 46 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:190: T66
                {
                mT66(); 

                }
                break;
            case 47 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:194: T67
                {
                mT67(); 

                }
                break;
            case 48 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:198: T68
                {
                mT68(); 

                }
                break;
            case 49 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:202: T69
                {
                mT69(); 

                }
                break;
            case 50 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:206: T70
                {
                mT70(); 

                }
                break;
            case 51 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:210: T71
                {
                mT71(); 

                }
                break;
            case 52 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:214: T72
                {
                mT72(); 

                }
                break;
            case 53 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:218: T73
                {
                mT73(); 

                }
                break;
            case 54 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:222: T74
                {
                mT74(); 

                }
                break;
            case 55 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:226: T75
                {
                mT75(); 

                }
                break;
            case 56 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:230: T76
                {
                mT76(); 

                }
                break;
            case 57 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:234: T77
                {
                mT77(); 

                }
                break;
            case 58 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:238: T78
                {
                mT78(); 

                }
                break;
            case 59 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:242: T79
                {
                mT79(); 

                }
                break;
            case 60 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:246: T80
                {
                mT80(); 

                }
                break;
            case 61 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:250: T81
                {
                mT81(); 

                }
                break;
            case 62 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:254: T82
                {
                mT82(); 

                }
                break;
            case 63 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:258: T83
                {
                mT83(); 

                }
                break;
            case 64 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:262: T84
                {
                mT84(); 

                }
                break;
            case 65 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:266: T85
                {
                mT85(); 

                }
                break;
            case 66 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:270: T86
                {
                mT86(); 

                }
                break;
            case 67 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:274: T87
                {
                mT87(); 

                }
                break;
            case 68 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:278: T88
                {
                mT88(); 

                }
                break;
            case 69 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:282: T89
                {
                mT89(); 

                }
                break;
            case 70 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:286: T90
                {
                mT90(); 

                }
                break;
            case 71 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:290: T91
                {
                mT91(); 

                }
                break;
            case 72 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:294: T92
                {
                mT92(); 

                }
                break;
            case 73 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:298: T93
                {
                mT93(); 

                }
                break;
            case 74 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:302: T94
                {
                mT94(); 

                }
                break;
            case 75 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:306: T95
                {
                mT95(); 

                }
                break;
            case 76 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:310: T96
                {
                mT96(); 

                }
                break;
            case 77 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:314: T97
                {
                mT97(); 

                }
                break;
            case 78 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:318: T98
                {
                mT98(); 

                }
                break;
            case 79 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:322: T99
                {
                mT99(); 

                }
                break;
            case 80 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:326: T100
                {
                mT100(); 

                }
                break;
            case 81 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:331: T101
                {
                mT101(); 

                }
                break;
            case 82 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:336: T102
                {
                mT102(); 

                }
                break;
            case 83 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:341: T103
                {
                mT103(); 

                }
                break;
            case 84 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:346: T104
                {
                mT104(); 

                }
                break;
            case 85 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:351: T105
                {
                mT105(); 

                }
                break;
            case 86 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:356: T106
                {
                mT106(); 

                }
                break;
            case 87 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:361: T107
                {
                mT107(); 

                }
                break;
            case 88 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:366: T108
                {
                mT108(); 

                }
                break;
            case 89 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:371: T109
                {
                mT109(); 

                }
                break;
            case 90 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:376: T110
                {
                mT110(); 

                }
                break;
            case 91 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:381: T111
                {
                mT111(); 

                }
                break;
            case 92 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:386: T112
                {
                mT112(); 

                }
                break;
            case 93 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:391: T113
                {
                mT113(); 

                }
                break;
            case 94 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:396: T114
                {
                mT114(); 

                }
                break;
            case 95 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:401: T115
                {
                mT115(); 

                }
                break;
            case 96 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:406: T116
                {
                mT116(); 

                }
                break;
            case 97 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:411: T117
                {
                mT117(); 

                }
                break;
            case 98 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:416: T118
                {
                mT118(); 

                }
                break;
            case 99 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:421: T119
                {
                mT119(); 

                }
                break;
            case 100 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:426: T120
                {
                mT120(); 

                }
                break;
            case 101 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:431: T121
                {
                mT121(); 

                }
                break;
            case 102 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:436: T122
                {
                mT122(); 

                }
                break;
            case 103 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:441: T123
                {
                mT123(); 

                }
                break;
            case 104 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:446: T124
                {
                mT124(); 

                }
                break;
            case 105 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:451: T125
                {
                mT125(); 

                }
                break;
            case 106 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:456: T126
                {
                mT126(); 

                }
                break;
            case 107 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:461: T127
                {
                mT127(); 

                }
                break;
            case 108 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:466: T128
                {
                mT128(); 

                }
                break;
            case 109 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:471: T129
                {
                mT129(); 

                }
                break;
            case 110 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:476: T130
                {
                mT130(); 

                }
                break;
            case 111 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:481: T131
                {
                mT131(); 

                }
                break;
            case 112 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:486: T132
                {
                mT132(); 

                }
                break;
            case 113 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:491: T133
                {
                mT133(); 

                }
                break;
            case 114 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:496: T134
                {
                mT134(); 

                }
                break;
            case 115 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:501: T135
                {
                mT135(); 

                }
                break;
            case 116 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:506: T136
                {
                mT136(); 

                }
                break;
            case 117 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:511: T137
                {
                mT137(); 

                }
                break;
            case 118 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:516: T138
                {
                mT138(); 

                }
                break;
            case 119 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:521: T139
                {
                mT139(); 

                }
                break;
            case 120 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:526: T140
                {
                mT140(); 

                }
                break;
            case 121 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:531: T141
                {
                mT141(); 

                }
                break;
            case 122 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:536: T142
                {
                mT142(); 

                }
                break;
            case 123 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:541: T143
                {
                mT143(); 

                }
                break;
            case 124 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:546: T144
                {
                mT144(); 

                }
                break;
            case 125 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:551: T145
                {
                mT145(); 

                }
                break;
            case 126 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:556: T146
                {
                mT146(); 

                }
                break;
            case 127 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:561: T147
                {
                mT147(); 

                }
                break;
            case 128 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:566: T148
                {
                mT148(); 

                }
                break;
            case 129 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:571: T149
                {
                mT149(); 

                }
                break;
            case 130 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:576: T150
                {
                mT150(); 

                }
                break;
            case 131 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:581: T151
                {
                mT151(); 

                }
                break;
            case 132 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:586: T152
                {
                mT152(); 

                }
                break;
            case 133 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:591: T153
                {
                mT153(); 

                }
                break;
            case 134 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:596: T154
                {
                mT154(); 

                }
                break;
            case 135 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:601: T155
                {
                mT155(); 

                }
                break;
            case 136 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:606: T156
                {
                mT156(); 

                }
                break;
            case 137 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:611: T157
                {
                mT157(); 

                }
                break;
            case 138 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:616: T158
                {
                mT158(); 

                }
                break;
            case 139 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:621: T159
                {
                mT159(); 

                }
                break;
            case 140 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:626: T160
                {
                mT160(); 

                }
                break;
            case 141 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:631: T161
                {
                mT161(); 

                }
                break;
            case 142 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:636: T162
                {
                mT162(); 

                }
                break;
            case 143 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:641: T163
                {
                mT163(); 

                }
                break;
            case 144 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:646: T164
                {
                mT164(); 

                }
                break;
            case 145 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:651: T165
                {
                mT165(); 

                }
                break;
            case 146 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:656: T166
                {
                mT166(); 

                }
                break;
            case 147 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:661: T167
                {
                mT167(); 

                }
                break;
            case 148 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:666: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 149 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:674: RULE_PID
                {
                mRULE_PID(); 

                }
                break;
            case 150 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:683: RULE_REGULAR_EXPR
                {
                mRULE_REGULAR_EXPR(); 

                }
                break;
            case 151 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:701: RULE_SIMPLE_PATTERN
                {
                mRULE_SIMPLE_PATTERN(); 

                }
                break;
            case 152 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:721: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 153 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:733: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 154 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:743: RULE_TEXTSTART
                {
                mRULE_TEXTSTART(); 

                }
                break;
            case 155 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:758: RULE_TEXTEND
                {
                mRULE_TEXTEND(); 

                }
                break;
            case 156 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:771: RULE_TEXTMID
                {
                mRULE_TEXTMID(); 

                }
                break;
            case 157 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:784: RULE_JAVADOC
                {
                mRULE_JAVADOC(); 

                }
                break;
            case 158 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:797: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 159 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:813: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 160 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:829: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 161 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:837: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 162 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:846: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 163 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:855: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 164 :
                // ../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g:1:868: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\1\uffff\3\72\1\uffff\2\72\2\uffff\1\72\1\uffff\2\72\2\uffff\1\72"+
        "\1\133\7\72\2\uffff\1\160\2\72\1\170\1\172\1\174\1\72\1\u0083\1"+
        "\u0086\1\u0088\1\u008a\1\70\1\u0090\1\u0092\1\u0094\1\uffff\1\u0097"+
        "\1\u0099\1\u009a\1\72\1\u009d\2\70\1\uffff\3\70\1\uffff\2\u00a7"+
        "\1\uffff\1\72\1\uffff\3\72\1\u00b2\2\72\1\uffff\3\72\1\u00bb\1\u00bc"+
        "\2\uffff\4\72\1\uffff\7\72\2\uffff\3\72\2\uffff\20\72\3\uffff\1"+
        "\u00ea\1\uffff\4\72\4\uffff\1\u00f2\3\uffff\4\72\16\uffff\1\u00fd"+
        "\13\uffff\1\72\15\uffff\1\u00a7\5\72\1\u0109\2\72\1\uffff\2\72\1"+
        "\u010e\1\u010f\4\72\2\uffff\6\72\1\uffff\11\72\1\u0127\3\72\4\uffff"+
        "\16\72\1\u013f\5\72\2\uffff\4\72\6\uffff\3\72\1\u014d\1\72\1\u014f"+
        "\1\72\2\uffff\1\72\3\uffff\7\72\1\uffff\1\u015a\3\72\2\uffff\27"+
        "\72\1\uffff\1\u0177\2\72\3\uffff\5\72\1\u017f\10\72\1\u0189\1\u018a"+
        "\1\u018c\1\uffff\1\u018d\10\72\1\uffff\1\u0197\1\u0198\1\72\1\uffff"+
        "\1\u019a\1\uffff\11\72\2\uffff\5\72\1\u01a9\1\72\1\u01ab\22\72\1"+
        "\u01be\1\72\1\uffff\3\72\1\u01c4\1\72\1\u01c6\1\72\1\uffff\1\u01c8"+
        "\10\72\5\uffff\1\72\1\uffff\6\72\3\uffff\1\u01da\1\uffff\5\72\1"+
        "\u01e0\10\72\1\uffff\1\72\1\uffff\1\u01ea\2\72\1\u01ed\1\u01ee\6"+
        "\72\1\u01f5\2\72\1\u01f8\1\72\1\u01fa\1\72\1\uffff\1\u01fc\4\72"+
        "\1\uffff\1\72\1\uffff\1\72\1\uffff\1\u0203\7\72\1\u020b\1\u020c"+
        "\1\72\1\u020f\2\72\1\u0213\3\uffff\5\72\1\uffff\3\72\1\uffff\1\72"+
        "\1\uffff\1\u021d\1\72\1\u021f\2\uffff\1\72\2\uffff\1\u0226\1\72"+
        "\1\u0228\3\72\1\uffff\2\72\1\uffff\1\72\1\uffff\1\72\1\uffff\1\u0230"+
        "\1\u0231\1\72\1\u0233\1\72\2\uffff\1\72\1\u0236\1\72\1\u0238\3\72"+
        "\2\uffff\1\u023d\2\uffff\1\u023e\1\u0240\1\72\1\uffff\1\72\1\uffff"+
        "\1\u0243\1\u0245\1\72\1\u0247\1\uffff\2\72\1\uffff\1\72\6\uffff"+
        "\1\72\1\uffff\1\u024e\1\uffff\5\72\1\u0254\1\72\2\uffff\1\u0256"+
        "\1\uffff\2\72\1\uffff\1\72\1\uffff\3\72\5\uffff\1\u025d\1\72\3\uffff"+
        "\1\72\1\uffff\3\72\2\uffff\1\72\1\uffff\2\72\1\uffff\2\72\1\uffff"+
        "\1\u0269\2\uffff\1\72\1\u026b\2\72\2\uffff\1\u026e\1\uffff\1\u0271"+
        "\1\u0272\1\72\1\u0274\1\u0275\1\u0276\3\72\1\uffff\1\u027a\1\uffff"+
        "\1\u027b\1\u027c\5\uffff\1\u027d\3\uffff\3\72\4\uffff\1\u0281\2"+
        "\72\1\uffff\1\u0284\1\72\1\uffff\4\72\1\u028a\1\uffff";
    static final String DFA25_eofS =
        "\u028b\uffff";
    static final String DFA25_minS =
        "\1\0\1\145\1\156\1\143\1\uffff\1\141\1\146\2\uffff\1\145\1\uffff"+
        "\1\156\1\141\2\uffff\1\154\1\u00bb\2\141\1\150\1\141\1\162\1\141"+
        "\1\145\2\uffff\1\75\1\157\1\162\1\52\1\56\1\160\1\141\1\53\1\55"+
        "\2\75\1\42\3\75\1\uffff\1\174\1\46\1\60\1\141\1\173\1\43\1\101\1"+
        "\uffff\3\0\1\uffff\2\60\1\uffff\1\145\1\uffff\1\145\1\151\1\144"+
        "\1\60\1\156\1\143\1\uffff\1\154\1\162\1\143\2\60\2\uffff\1\160\1"+
        "\165\1\154\1\151\1\uffff\1\164\1\55\1\145\1\141\1\142\1\154\1\162"+
        "\2\uffff\1\144\1\163\1\143\1\0\1\uffff\2\156\1\141\1\154\1\143\1"+
        "\156\2\145\1\164\1\155\1\167\1\154\1\145\1\141\1\164\1\146\3\uffff"+
        "\1\75\1\uffff\1\144\1\164\1\151\1\141\1\uffff\1\0\2\uffff\1\56\1"+
        "\uffff\1\157\1\uffff\1\145\1\165\1\147\1\155\16\uffff\1\75\13\uffff"+
        "\1\166\5\uffff\3\0\5\uffff\1\60\1\170\1\165\1\157\1\151\1\154\1"+
        "\60\1\164\1\141\1\uffff\1\157\1\145\2\60\1\163\1\164\1\165\1\154"+
        "\2\uffff\1\145\1\162\1\145\1\165\1\164\1\160\1\uffff\1\166\2\143"+
        "\1\164\1\154\1\164\1\151\1\141\1\151\1\60\1\145\1\154\1\145\3\0"+
        "\1\uffff\1\143\1\141\1\147\1\163\1\154\1\145\1\143\1\150\1\141\2"+
        "\143\1\156\1\150\1\145\1\60\1\154\1\145\1\144\1\145\1\141\2\uffff"+
        "\1\151\1\141\1\154\1\156\4\uffff\1\163\1\uffff\1\163\1\156\1\157"+
        "\1\60\1\145\1\60\1\145\2\uffff\1\151\2\0\1\uffff\1\160\1\151\2\154"+
        "\1\163\1\141\1\163\1\uffff\1\55\2\164\1\160\2\uffff\1\151\1\141"+
        "\1\164\1\165\1\162\2\143\1\145\1\143\1\165\1\141\1\151\2\145\1\157"+
        "\1\146\1\151\2\143\1\154\1\162\1\167\1\146\1\uffff\1\60\1\165\1"+
        "\156\2\0\1\uffff\1\164\1\154\1\155\2\145\1\60\1\150\1\145\1\142"+
        "\1\145\1\141\1\151\1\145\1\153\2\60\1\55\1\uffff\1\60\1\144\1\55"+
        "\1\163\1\165\1\146\1\142\1\144\1\143\1\164\2\60\1\167\1\uffff\1"+
        "\60\1\uffff\1\163\1\156\1\157\1\162\1\165\1\164\1\151\1\143\1\151"+
        "\2\uffff\1\145\1\141\1\164\1\157\1\156\1\60\1\144\1\60\1\145\1\164"+
        "\1\156\1\150\2\164\1\144\1\145\1\162\1\156\1\157\1\143\1\157\1\156"+
        "\1\171\1\154\1\171\1\151\1\60\1\146\1\uffff\2\144\1\151\1\60\1\145"+
        "\1\60\1\144\1\uffff\1\60\1\144\1\151\1\162\1\151\1\170\1\164\1\143"+
        "\1\157\5\uffff\1\171\1\uffff\1\164\1\154\1\171\1\154\1\145\1\150"+
        "\1\143\2\uffff\1\60\1\uffff\1\164\1\147\1\162\1\145\1\164\1\60\1"+
        "\157\1\145\1\164\1\55\1\164\1\55\1\156\1\143\1\uffff\1\145\1\uffff"+
        "\1\60\1\55\1\164\2\60\2\145\1\144\1\164\1\144\1\162\1\60\1\156\1"+
        "\160\1\60\1\145\1\60\1\164\1\uffff\1\60\1\145\1\163\1\157\1\171"+
        "\1\uffff\1\156\1\uffff\1\55\1\uffff\1\60\1\154\2\156\1\164\1\151"+
        "\1\164\1\165\2\60\1\164\1\55\1\145\1\162\1\60\3\uffff\1\141\1\55"+
        "\1\164\1\163\1\151\1\uffff\1\156\1\55\1\157\1\uffff\1\151\1\uffff"+
        "\1\60\1\145\1\60\1\uffff\1\142\1\151\2\uffff\1\60\1\163\1\60\2\151"+
        "\1\155\1\uffff\1\144\1\165\1\uffff\1\154\1\uffff\1\143\1\uffff\2"+
        "\60\1\156\1\60\1\164\2\uffff\1\151\1\60\1\145\1\60\1\157\1\151\1"+
        "\164\2\uffff\1\55\2\uffff\1\60\1\55\1\163\1\uffff\1\155\1\uffff"+
        "\1\60\1\55\1\157\1\60\1\uffff\1\162\1\157\1\uffff\1\157\1\uffff"+
        "\1\145\4\uffff\1\141\1\uffff\1\60\1\uffff\1\145\1\164\1\55\1\151"+
        "\1\164\1\60\1\150\2\uffff\1\60\1\uffff\1\55\1\164\1\uffff\1\162"+
        "\1\uffff\1\156\1\157\1\55\5\uffff\1\60\1\160\1\uffff\1\155\1\uffff"+
        "\1\156\1\uffff\1\171\1\156\1\146\2\uffff\1\154\1\uffff\1\163\1\151"+
        "\1\uffff\1\164\1\143\1\uffff\1\60\2\uffff\1\171\1\60\1\163\1\156"+
        "\2\uffff\1\60\1\141\2\60\1\163\3\60\1\157\1\151\1\157\1\uffff\1"+
        "\60\1\uffff\2\60\5\uffff\1\60\3\uffff\1\156\1\157\1\156\4\uffff"+
        "\1\60\1\156\1\144\1\uffff\1\60\1\151\1\uffff\1\164\1\151\1\157\1"+
        "\156\1\60\1\uffff";
    static final String DFA25_maxS =
        "\1\ufffe\1\145\2\163\1\uffff\1\145\1\163\2\uffff\1\167\1\uffff\2"+
        "\165\2\uffff\1\170\1\u00bb\1\165\1\157\1\151\1\165\1\162\1\157\1"+
        "\145\2\uffff\1\76\2\165\1\75\1\56\1\160\1\162\5\75\1\176\2\75\1"+
        "\uffff\1\174\1\46\1\172\1\141\1\173\1\133\1\172\1\uffff\3\ufffe"+
        "\1\uffff\1\170\1\145\1\uffff\1\166\1\uffff\1\145\1\151\1\144\1\172"+
        "\1\156\1\143\1\uffff\2\162\1\163\2\172\2\uffff\1\160\1\165\1\161"+
        "\1\151\1\uffff\1\164\1\55\1\157\1\141\1\142\1\163\1\162\2\uffff"+
        "\1\166\1\163\1\164\1\ufffe\1\uffff\2\156\1\141\1\154\1\164\1\156"+
        "\2\145\1\164\1\155\1\167\1\154\1\145\1\141\1\164\1\146\3\uffff\1"+
        "\75\1\uffff\1\144\1\164\1\151\1\141\1\uffff\1\ufffe\2\uffff\1\56"+
        "\1\uffff\1\162\1\uffff\1\162\1\171\1\147\1\155\16\uffff\1\75\13"+
        "\uffff\1\166\5\uffff\3\ufffe\5\uffff\1\145\1\170\2\165\1\151\1\157"+
        "\1\172\1\164\1\141\1\uffff\1\157\1\145\2\172\1\163\1\164\1\165\1"+
        "\154\2\uffff\1\145\1\162\1\145\1\165\1\164\1\160\1\uffff\2\166\1"+
        "\143\1\164\1\154\1\164\1\151\1\141\1\164\1\172\1\145\1\154\1\145"+
        "\3\ufffe\1\uffff\1\143\1\141\1\147\1\163\1\154\1\145\1\143\1\150"+
        "\1\141\1\164\1\143\1\156\1\150\1\145\1\172\1\154\1\145\1\144\1\145"+
        "\1\141\2\uffff\1\151\1\141\1\154\1\156\4\uffff\1\163\1\uffff\1\163"+
        "\1\156\1\157\1\172\1\145\1\172\1\145\2\uffff\1\151\2\ufffe\1\uffff"+
        "\1\160\1\151\2\154\1\163\1\141\1\163\1\uffff\1\172\2\164\1\160\2"+
        "\uffff\1\151\1\141\1\164\1\165\1\162\2\143\1\145\1\143\1\165\1\141"+
        "\1\151\2\145\1\157\1\146\2\151\1\143\1\154\1\162\1\167\1\146\1\uffff"+
        "\1\172\1\165\1\156\2\ufffe\1\uffff\1\164\1\154\1\155\2\145\1\172"+
        "\1\150\1\145\1\142\2\145\1\151\1\145\1\153\3\172\1\uffff\1\172\1"+
        "\144\1\55\1\163\1\165\1\146\1\142\1\144\1\143\1\164\2\172\1\167"+
        "\1\uffff\1\172\1\uffff\1\163\1\156\1\157\1\162\1\165\1\164\1\151"+
        "\1\143\1\151\2\uffff\1\145\1\141\1\164\1\157\1\156\1\172\1\144\1"+
        "\172\1\145\1\164\1\156\1\150\2\164\1\144\1\145\1\162\1\156\1\157"+
        "\1\143\1\157\1\156\1\171\1\154\1\171\1\151\1\172\1\146\1\uffff\2"+
        "\144\1\151\1\172\1\145\1\172\1\144\1\uffff\1\172\1\144\1\151\1\162"+
        "\1\151\1\170\1\164\1\143\1\157\5\uffff\1\171\1\uffff\1\164\1\154"+
        "\1\171\1\154\1\145\1\150\1\151\2\uffff\1\172\1\uffff\1\164\1\147"+
        "\1\162\1\145\1\164\1\172\1\157\1\145\1\164\1\55\1\164\1\55\1\156"+
        "\1\143\1\uffff\1\145\1\uffff\1\172\1\55\1\164\2\172\2\145\1\144"+
        "\1\164\1\144\1\162\1\172\1\156\1\160\1\172\1\145\1\172\1\164\1\uffff"+
        "\1\172\1\145\1\163\1\157\1\171\1\uffff\1\156\1\uffff\1\55\1\uffff"+
        "\1\172\1\154\2\156\1\164\1\151\1\164\1\165\2\172\1\164\1\172\1\145"+
        "\1\162\1\172\3\uffff\1\141\1\55\1\164\1\163\1\151\1\uffff\1\156"+
        "\1\55\1\157\1\uffff\1\151\1\uffff\1\172\1\145\1\172\1\uffff\1\165"+
        "\1\151\2\uffff\1\172\1\163\1\172\2\151\1\155\1\uffff\1\144\1\165"+
        "\1\uffff\1\154\1\uffff\1\143\1\uffff\2\172\1\156\1\172\1\164\2\uffff"+
        "\1\151\1\172\1\145\1\172\1\157\1\151\1\164\2\uffff\1\172\2\uffff"+
        "\2\172\1\163\1\uffff\1\155\1\uffff\2\172\1\157\1\172\1\uffff\1\162"+
        "\1\157\1\uffff\1\157\1\uffff\1\165\4\uffff\1\141\1\uffff\1\172\1"+
        "\uffff\1\145\1\164\1\55\1\151\1\164\1\172\1\150\2\uffff\1\172\1"+
        "\uffff\1\55\1\164\1\uffff\1\162\1\uffff\1\156\1\157\1\55\5\uffff"+
        "\1\172\1\160\1\uffff\1\155\1\uffff\1\156\1\uffff\1\171\1\156\1\146"+
        "\2\uffff\1\154\1\uffff\1\163\1\151\1\uffff\1\164\1\143\1\uffff\1"+
        "\172\2\uffff\1\171\1\172\1\163\1\156\2\uffff\1\172\1\151\2\172\1"+
        "\163\3\172\1\157\1\151\1\157\1\uffff\1\172\1\uffff\2\172\5\uffff"+
        "\1\172\3\uffff\1\156\1\157\1\156\4\uffff\1\172\1\156\1\144\1\uffff"+
        "\1\172\1\151\1\uffff\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\4\2\uffff\1\10\1\11\1\uffff\1\13\2\uffff\1\16\1\17\11"+
        "\uffff\1\41\1\42\17\uffff\1\134\7\uffff\1\u0094\3\uffff\1\u00a0"+
        "\2\uffff\1\u00a4\1\uffff\1\u0094\6\uffff\1\4\5\uffff\1\10\1\11\4"+
        "\uffff\1\13\7\uffff\1\16\1\17\4\uffff\1\24\20\uffff\1\41\1\42\1"+
        "\133\1\uffff\1\44\4\uffff\1\116\1\uffff\1\u009f\1\51\1\uffff\1\54"+
        "\1\uffff\1\u0088\4\uffff\1\113\1\150\1\142\1\114\1\151\1\143\1\115"+
        "\1\144\1\117\1\145\1\120\1\u0096\1\u0097\1\125\1\uffff\1\147\1\126"+
        "\1\130\1\127\1\131\1\134\1\137\1\u0086\1\140\1\u008a\1\154\1\uffff"+
        "\1\u0095\1\u0089\1\u008c\1\u008b\1\u0098\3\uffff\1\u0099\1\u00a0"+
        "\1\u00a1\1\u00a2\1\u00a3\11\uffff\1\3\10\uffff\1\7\1\163\6\uffff"+
        "\1\77\20\uffff\1\u009b\24\uffff\1\122\1\121\4\uffff\1\u009d\1\u009e"+
        "\1\55\1\146\1\uffff\1\56\7\uffff\1\124\1\123\3\uffff\1\u009a\7\uffff"+
        "\1\2\4\uffff\1\63\1\132\27\uffff\1\22\5\uffff\1\u009c\21\uffff\1"+
        "\172\15\uffff\1\156\1\uffff\1\u008f\11\uffff\1\173\1\5\34\uffff"+
        "\1\165\7\uffff\1\110\11\uffff\1\27\1\52\1\31\1\30\1\u0087\1\uffff"+
        "\1\37\7\uffff\1\170\1\164\1\uffff\1\67\16\uffff\1\60\1\uffff\1\135"+
        "\22\uffff\1\166\5\uffff\1\43\1\uffff\1\70\1\uffff\1\161\17\uffff"+
        "\1\61\1\57\1\155\5\uffff\1\62\3\uffff\1\76\1\uffff\1\75\3\uffff"+
        "\1\12\2\uffff\1\162\1\14\6\uffff\1\u0091\2\uffff\1\73\1\uffff\1"+
        "\160\1\uffff\1\167\5\uffff\1\u0085\1\136\7\uffff\1\32\1\u008d\1"+
        "\uffff\1\175\1\171\3\uffff\1\72\1\uffff\1\u0080\4\uffff\1\100\2"+
        "\uffff\1\6\1\uffff\1\102\1\uffff\1\21\1\174\1\106\1\104\1\uffff"+
        "\1\u0092\1\uffff\1\153\7\uffff\1\101\1\36\1\uffff\1\157\2\uffff"+
        "\1\53\1\uffff\1\152\3\uffff\1\40\1\71\1\45\1\176\1\47\2\uffff\1"+
        "\1\1\uffff\1\20\1\uffff\1\u008e\3\uffff\1\177\1\105\1\uffff\1\15"+
        "\2\uffff\1\23\2\uffff\1\u0093\1\uffff\1\112\1\25\4\uffff\1\74\1"+
        "\66\13\uffff\1\107\1\uffff\1\111\2\uffff\1\u0090\1\34\1\33\1\103"+
        "\1\64\1\uffff\1\141\1\46\1\35\3\uffff\1\26\1\u0081\1\65\1\50\3\uffff"+
        "\1\u0082\2\uffff\1\u0084\5\uffff\1\u0083";
    static final String DFA25_specialS =
        "\u028b\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\70\2\65\2\70\1\65\22\70\1\65\1\46\1\62\1\57\1\56\1\44\1"+
            "\53\1\63\1\30\1\31\1\43\1\41\1\7\1\42\1\36\1\35\1\66\11\67\1"+
            "\12\1\4\1\50\1\32\1\47\1\51\1\37\32\61\1\15\1\70\1\16\1\60\1"+
            "\54\1\70\1\3\1\34\1\22\1\27\1\17\1\21\1\25\1\55\1\6\2\61\1\26"+
            "\1\33\1\24\1\13\1\14\1\61\1\1\1\11\1\40\1\2\1\5\1\23\3\61\1"+
            "\10\1\52\1\20\1\45\54\70\1\64\uff53\70",
            "\1\71",
            "\1\74\1\uffff\1\75\2\uffff\1\73",
            "\1\100\12\uffff\1\77\4\uffff\1\76",
            "",
            "\1\102\3\uffff\1\103",
            "\1\106\7\uffff\1\104\4\uffff\1\105",
            "",
            "",
            "\1\113\11\uffff\1\112\5\uffff\1\111\1\uffff\1\114",
            "",
            "\1\117\6\uffff\1\116",
            "\1\124\12\uffff\1\121\2\uffff\1\123\2\uffff\1\120\2\uffff\1"+
            "\122",
            "",
            "",
            "\1\130\1\uffff\1\127\11\uffff\1\131",
            "\1\132",
            "\1\137\7\uffff\1\135\10\uffff\1\136\2\uffff\1\134",
            "\1\140\6\uffff\1\142\6\uffff\1\141",
            "\1\143\1\144",
            "\1\145\3\uffff\1\146\17\uffff\1\147",
            "\1\150",
            "\1\152\15\uffff\1\151",
            "\1\153",
            "",
            "",
            "\1\157\1\156",
            "\1\161\5\uffff\1\162",
            "\1\164\2\uffff\1\163",
            "\1\166\4\uffff\1\167\15\uffff\1\165",
            "\1\171",
            "\1\173",
            "\1\177\6\uffff\1\175\1\u0080\10\uffff\1\176",
            "\1\u0082\21\uffff\1\u0081",
            "\1\u0085\17\uffff\1\u0084",
            "\1\u0087",
            "\1\u0089",
            "\1\u008d\4\uffff\1\u008d\7\uffff\1\u008c\15\uffff\1\u008b",
            "\1\u008f\100\uffff\1\u008e",
            "\1\u0091",
            "\1\u0093",
            "",
            "\1\u0096",
            "\1\u0098",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u009b",
            "\1\u009c",
            "\1\u009e\67\uffff\1\u009f",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\u00a0\1\uffff\2\u00a0\1\uffff\ufff1\u00a0",
            "\12\u00a0\1\uffff\2\u00a0\1\uffff\ufff1\u00a0",
            "\175\u00a3\1\u00a1\55\u00a3\1\u00a2\17\u00a3\1\u00a4\uff43\u00a3",
            "",
            "\12\u00a9\13\uffff\1\u00a8\22\uffff\1\u00a6\14\uffff\1\u00a8"+
            "\22\uffff\1\u00a6",
            "\12\u00a9\13\uffff\1\u00a8\37\uffff\1\u00a8",
            "",
            "\1\u00aa\12\uffff\1\u00ae\1\u00ab\1\uffff\1\u00ac\2\uffff\1"+
            "\u00ad",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\u00b5\5\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00ba\14\uffff\1\u00b9\2\uffff\1\u00b8",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf\4\uffff\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c6\3\uffff\1\u00c4\5\uffff\1\u00c5",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00ca\6\uffff\1\u00c9",
            "\1\u00cb",
            "",
            "",
            "\1\u00cc\21\uffff\1\u00cd",
            "\1\u00ce",
            "\1\u00cf\20\uffff\1\u00d0",
            "\175\u00d3\1\u00d1\55\u00d3\1\u00d2\17\u00d3\1\u00d4\uff43\u00d3",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00dc\10\uffff\1\u00d9\3\uffff\1\u00dd\2\uffff\1\u00da\1"+
            "\u00db",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "",
            "\1\u00e9",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\52\u00f0\1\u00ef\uffd4\u00f0",
            "",
            "",
            "\1\u00f1",
            "",
            "\1\u00f3\2\uffff\1\u00f4",
            "",
            "\1\u00f6\3\uffff\1\u00f5\10\uffff\1\u00f7",
            "\1\u00f9\3\uffff\1\u00f8",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00fc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00fe",
            "",
            "",
            "",
            "",
            "",
            "\u00bb\u00ff\1\uffff\uff43\u00ff",
            "\173\u0100\1\u0101\uff83\u0100",
            "\175\u00a3\1\u00a1\55\u00a3\1\u00a2\17\u00a3\1\u00a4\uff43\u00a3",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a9\13\uffff\1\u00a8\37\uffff\1\u00a8",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104\5\uffff\1\u0105",
            "\1\u0106",
            "\1\u0107\2\uffff\1\u0108",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\u010d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011c\14\uffff\1\u011d\5\uffff\1\u011b",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0126\11\uffff\1\u0125\1\u0124",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\u00bb\u012b\1\uffff\uff43\u012b",
            "\173\u012c\1\u012d\uff83\u012c",
            "\175\u00d3\1\u00d1\55\u00d3\1\u00d2\17\u00d3\1\u00d4\uff43\u00d3",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137\1\u0139\11\uffff\1\u013a\5\uffff\1\u0138",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "",
            "",
            "",
            "\1\u0149",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u014e",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0150",
            "",
            "",
            "\1\u0151",
            "\175\u00a3\1\u00a1\55\u00a3\1\u00a2\17\u00a3\1\u00a4\uff43\u00a3",
            "\175\u00a3\1\u00a1\55\u00a3\1\u00a2\17\u00a3\1\u00a4\uff43\u00a3",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\u0159\2\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32"+
            "\72",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f\5\uffff\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\10\72\1\u0176\21\72",
            "\1\u0178",
            "\1\u0179",
            "\175\u00d3\1\u00d1\55\u00d3\1\u00d2\17\u00d3\1\u00d4\uff43\u00d3",
            "\175\u00d3\1\u00d1\55\u00d3\1\u00d2\17\u00d3\1\u00d4\uff43\u00d3",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184\3\uffff\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u018b\2\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32"+
            "\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0199",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01aa",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72\1\u01c3\16\72",
            "\1\u01c5",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01c7",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "",
            "",
            "",
            "",
            "",
            "\1\u01d1",
            "",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d9\5\uffff\1\u01d8",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "",
            "\1\u01e9",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01eb",
            "\1\u01ec",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01f6",
            "\1\u01f7",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01f9",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01fb",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "",
            "\1\u0201",
            "",
            "\1\u0202",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u020d",
            "\1\u020e\2\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32"+
            "\72",
            "\1\u0210",
            "\1\u0211",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\u0212\25\72",
            "",
            "",
            "",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "",
            "\1\u021c",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u021e",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0220\3\uffff\1\u0224\13\uffff\1\u0221\1\u0223\1\uffff\1"+
            "\u0222",
            "\1\u0225",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0227",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "",
            "\1\u022c",
            "\1\u022d",
            "",
            "\1\u022e",
            "",
            "\1\u022f",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0232",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0234",
            "",
            "",
            "\1\u0235",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0237",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "",
            "",
            "\1\u023c\2\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32"+
            "\72",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u023f\2\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32"+
            "\72",
            "\1\u0241",
            "",
            "\1\u0242",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0244\2\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32"+
            "\72",
            "\1\u0246",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0248",
            "\1\u0249",
            "",
            "\1\u024a",
            "",
            "\1\u024c\17\uffff\1\u024b",
            "",
            "",
            "",
            "",
            "\1\u024d",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0255",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0257",
            "\1\u0258",
            "",
            "\1\u0259",
            "",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u025e",
            "",
            "\1\u025f",
            "",
            "\1\u0260",
            "",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "",
            "",
            "\1\u0264",
            "",
            "\1\u0265",
            "\1\u0266",
            "",
            "\1\u0267",
            "\1\u0268",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u026a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u026c",
            "\1\u026d",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u026f\7\uffff\1\u0270",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0273",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0282",
            "\1\u0283",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0285",
            "",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | T118 | T119 | T120 | T121 | T122 | T123 | T124 | T125 | T126 | T127 | T128 | T129 | T130 | T131 | T132 | T133 | T134 | T135 | T136 | T137 | T138 | T139 | T140 | T141 | T142 | T143 | T144 | T145 | T146 | T147 | T148 | T149 | T150 | T151 | T152 | T153 | T154 | T155 | T156 | T157 | T158 | T159 | T160 | T161 | T162 | T163 | T164 | T165 | T166 | T167 | RULE_ID | RULE_PID | RULE_REGULAR_EXPR | RULE_SIMPLE_PATTERN | RULE_STRING | RULE_TEXT | RULE_TEXTSTART | RULE_TEXTEND | RULE_TEXTMID | RULE_JAVADOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_HEX | RULE_INT | RULE_EXT_INT | RULE_ANY_OTHER );";
        }
    }
 

}