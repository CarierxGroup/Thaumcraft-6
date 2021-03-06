/*    */ package thaumcraft.common.lib.research.theorycraft;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.util.text.TextComponentTranslation;
/*    */ import thaumcraft.api.research.theorycraft.ResearchTableData;
/*    */ import thaumcraft.api.research.theorycraft.TheorycraftCard;
/*    */ 
/*    */ 
/*    */ public class CardFocus
/*    */   extends TheorycraftCard
/*    */ {
/* 12 */   public int getInspirationCost() { return 1; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 17 */   public String getResearchCategory() { return "AUROMANCY"; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 22 */   public String getLocalizedName() { return (new TextComponentTranslation("card.focus.name", new Object[0])).func_150254_d(); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   public String getLocalizedText() { return (new TextComponentTranslation("card.focus.text", new Object[0])).func_150254_d(); }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean activate(EntityPlayer player, ResearchTableData data) {
/* 32 */     data.addTotal(getResearchCategory(), 15);
/* 33 */     data.bonusDraws++;
/* 34 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\工程开发\Cracked\Thaumcraft-1.12.2-6.1.BETA26.jar!\thaumcraft\common\lib\research\theorycraft\CardFocus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */