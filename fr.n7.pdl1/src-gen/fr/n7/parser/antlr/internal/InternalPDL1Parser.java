package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.PDL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'task'", "'note'", "'for'", "','", "'dep'", "'from'", "'to'", "'need'", "'of'", "'create'", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDL1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL1.g"; }



     	private PDL1GrammarAccess grammarAccess;

        public InternalPDL1Parser(TokenStream input, PDL1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL1.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL1.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL1.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL1.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:78:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // InternalPDL1.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // InternalPDL1.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // InternalPDL1.g:80:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalPDL1.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL1.g:106:3: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==18||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL1.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // InternalPDL1.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    // InternalPDL1.g:108:5: lv_processElements_3_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_3_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_3_0,
            	    						"fr.n7.PDL1.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL1.g:133:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL1.g:133:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL1.g:134:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL1.g:140:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resource_3= ruleResource ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_Resource_3 = null;



        	enterRule();

        try {
            // InternalPDL1.g:146:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resource_3= ruleResource ) )
            // InternalPDL1.g:147:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resource_3= ruleResource )
            {
            // InternalPDL1.g:147:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Resource_3= ruleResource )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL1.g:148:3: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL1.g:157:3: this_WorkSequence_1= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPDL1.g:166:3: this_Guidance_2= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPDL1.g:175:3: this_Resource_3= ruleResource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resource_3=ruleResource();

                    state._fsp--;


                    			current = this_Resource_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL1.g:187:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL1.g:187:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL1.g:188:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL1.g:194:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )? otherlv_4= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_need_3_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:200:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )? otherlv_4= '}' ) )
            // InternalPDL1.g:201:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )? otherlv_4= '}' )
            {
            // InternalPDL1.g:201:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )? otherlv_4= '}' )
            // InternalPDL1.g:202:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_need_3_0= ruleNeed ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getTaskKeyword_0());
            		
            // InternalPDL1.g:206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:207:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:208:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL1.g:228:3: ( (lv_need_3_0= ruleNeed ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPDL1.g:229:4: (lv_need_3_0= ruleNeed )
                    {
                    // InternalPDL1.g:229:4: (lv_need_3_0= ruleNeed )
                    // InternalPDL1.g:230:5: lv_need_3_0= ruleNeed
                    {

                    					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNeedNeedParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_need_3_0=ruleNeed();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    					}
                    					add(
                    						current,
                    						"need",
                    						lv_need_3_0,
                    						"fr.n7.PDL1.Need");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL1.g:255:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL1.g:255:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL1.g:256:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL1.g:262:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPDL1.g:268:2: ( (otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ) )
            // InternalPDL1.g:269:2: (otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? )
            {
            // InternalPDL1.g:269:2: (otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? )
            // InternalPDL1.g:270:3: otherlv_0= 'note' ( (lv_text_1_0= RULE_STRING ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalPDL1.g:274:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalPDL1.g:275:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalPDL1.g:275:4: (lv_text_1_0= RULE_STRING )
            // InternalPDL1.g:276:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_text_1_0, grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPDL1.g:292:3: (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL1.g:293:4: otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getForKeyword_2_0());
                    			
                    // InternalPDL1.g:297:4: ( (otherlv_3= RULE_ID ) )
                    // InternalPDL1.g:298:5: (otherlv_3= RULE_ID )
                    {
                    // InternalPDL1.g:298:5: (otherlv_3= RULE_ID )
                    // InternalPDL1.g:299:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGuidanceRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalPDL1.g:310:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPDL1.g:311:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGuidanceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalPDL1.g:315:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalPDL1.g:316:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalPDL1.g:316:6: (otherlv_5= RULE_ID )
                    	    // InternalPDL1.g:317:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGuidanceRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL1.g:334:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL1.g:334:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL1.g:335:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL1.g:341:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'dep' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:347:2: ( (otherlv_0= 'dep' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPDL1.g:348:2: (otherlv_0= 'dep' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPDL1.g:348:2: (otherlv_0= 'dep' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalPDL1.g:349:3: otherlv_0= 'dep' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getDepKeyword_0());
            		
            // InternalPDL1.g:353:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL1.g:354:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL1.g:354:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL1.g:355:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.PDL1.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
            		
            // InternalPDL1.g:376:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL1.g:377:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL1.g:377:4: (otherlv_3= RULE_ID )
            // InternalPDL1.g:378:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
            		
            // InternalPDL1.g:393:3: ( (otherlv_5= RULE_ID ) )
            // InternalPDL1.g:394:4: (otherlv_5= RULE_ID )
            {
            // InternalPDL1.g:394:4: (otherlv_5= RULE_ID )
            // InternalPDL1.g:395:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleNeed"
    // InternalPDL1.g:410:1: entryRuleNeed returns [EObject current=null] : iv_ruleNeed= ruleNeed EOF ;
    public final EObject entryRuleNeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeed = null;


        try {
            // InternalPDL1.g:410:45: (iv_ruleNeed= ruleNeed EOF )
            // InternalPDL1.g:411:2: iv_ruleNeed= ruleNeed EOF
            {
             newCompositeNode(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeed=ruleNeed();

            state._fsp--;

             current =iv_ruleNeed; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // InternalPDL1.g:417:1: ruleNeed returns [EObject current=null] : (otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nbResources_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPDL1.g:423:2: ( (otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalPDL1.g:424:2: (otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalPDL1.g:424:2: (otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            // InternalPDL1.g:425:3: otherlv_0= 'need' ( (lv_nbResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getNeedAccess().getNeedKeyword_0());
            		
            // InternalPDL1.g:429:3: ( (lv_nbResources_1_0= RULE_INT ) )
            // InternalPDL1.g:430:4: (lv_nbResources_1_0= RULE_INT )
            {
            // InternalPDL1.g:430:4: (lv_nbResources_1_0= RULE_INT )
            // InternalPDL1.g:431:5: lv_nbResources_1_0= RULE_INT
            {
            lv_nbResources_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_nbResources_1_0, grammarAccess.getNeedAccess().getNbResourcesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNeedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nbResources",
            						lv_nbResources_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNeedAccess().getOfKeyword_2());
            		
            // InternalPDL1.g:451:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL1.g:452:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL1.g:452:4: (otherlv_3= RULE_ID )
            // InternalPDL1.g:453:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNeedRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getNeedAccess().getResourceResourceCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeed"


    // $ANTLR start "entryRuleResource"
    // InternalPDL1.g:468:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalPDL1.g:468:49: (iv_ruleResource= ruleResource EOF )
            // InternalPDL1.g:469:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPDL1.g:475:1: ruleResource returns [EObject current=null] : (otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nbAvailableResources_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalPDL1.g:481:2: ( (otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalPDL1.g:482:2: (otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalPDL1.g:482:2: (otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalPDL1.g:483:3: otherlv_0= 'create' ( (lv_nbAvailableResources_1_0= RULE_INT ) ) otherlv_2= 'of' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getCreateKeyword_0());
            		
            // InternalPDL1.g:487:3: ( (lv_nbAvailableResources_1_0= RULE_INT ) )
            // InternalPDL1.g:488:4: (lv_nbAvailableResources_1_0= RULE_INT )
            {
            // InternalPDL1.g:488:4: (lv_nbAvailableResources_1_0= RULE_INT )
            // InternalPDL1.g:489:5: lv_nbAvailableResources_1_0= RULE_INT
            {
            lv_nbAvailableResources_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_nbAvailableResources_1_0, grammarAccess.getResourceAccess().getNbAvailableResourcesINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nbAvailableResources",
            						lv_nbAvailableResources_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getOfKeyword_2());
            		
            // InternalPDL1.g:509:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalPDL1.g:510:4: (lv_name_3_0= RULE_ID )
            {
            // InternalPDL1.g:510:4: (lv_name_3_0= RULE_ID )
            // InternalPDL1.g:511:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL1.g:531:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL1.g:537:2: ( ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) )
            // InternalPDL1.g:538:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            {
            // InternalPDL1.g:538:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPDL1.g:539:3: (enumLiteral_0= 'startToStart' )
                    {
                    // InternalPDL1.g:539:3: (enumLiteral_0= 'startToStart' )
                    // InternalPDL1.g:540:4: enumLiteral_0= 'startToStart'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL1.g:547:3: (enumLiteral_1= 'finishToStart' )
                    {
                    // InternalPDL1.g:547:3: (enumLiteral_1= 'finishToStart' )
                    // InternalPDL1.g:548:4: enumLiteral_1= 'finishToStart'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL1.g:555:3: (enumLiteral_2= 'startToFinish' )
                    {
                    // InternalPDL1.g:555:3: (enumLiteral_2= 'startToFinish' )
                    // InternalPDL1.g:556:4: enumLiteral_2= 'startToFinish'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL1.g:563:3: (enumLiteral_3= 'finishToFinish' )
                    {
                    // InternalPDL1.g:563:3: (enumLiteral_3= 'finishToFinish' )
                    // InternalPDL1.g:564:4: enumLiteral_3= 'finishToFinish'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000084E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});

}