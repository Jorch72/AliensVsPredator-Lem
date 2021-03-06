package org.avp.client.model.entities.living;

import com.arisux.mdx.lib.client.render.OpenGL;
import com.arisux.mdx.lib.client.render.model.Model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;


public class ModelTrilobite extends Model
{
    public ModelRenderer bodyFront;
    public ModelRenderer LFrontTentacle2;
    public ModelRenderer LMiddleTentacle1;
    public ModelRenderer bodyBack;
    public ModelRenderer LFrontTentacle1;
    public ModelRenderer LFrontTentacle3;
    public ModelRenderer LBackTentacle1;
    public ModelRenderer Tail1;
    public ModelRenderer LFrontTentacle4;
    public ModelRenderer LFrontTentacle5;
    public ModelRenderer LFrontClaw;
    public ModelRenderer RFrontTentacle1;
    public ModelRenderer RMiddleTentacle1;
    public ModelRenderer RBackTentacle1;
    public ModelRenderer RFrontTentacle2;
    public ModelRenderer RFrontTentacle3;
    public ModelRenderer RFrontTentacle4;
    public ModelRenderer RFrontTentacle5;
    public ModelRenderer RFrontClaw;
    public ModelRenderer Tail2;
    public ModelRenderer LMiddleTentacle2;
    public ModelRenderer LBackTentacle2;
    public ModelRenderer RMiddleTentacle2;
    public ModelRenderer RBackTentacle2;
    public ModelRenderer LMiddleTentacle3;
    public ModelRenderer LMiddleTentacle4;
    public ModelRenderer LMiddleTentacle5;
    public ModelRenderer LMiddleClaw;
    public ModelRenderer RMiddleTentacle3;
    public ModelRenderer RMiddleTentacle4;
    public ModelRenderer RMiddleTentacle5;
    public ModelRenderer RMiddleClaw;
    public ModelRenderer LBackTentacle3;
    public ModelRenderer LBackTentacle4;
    public ModelRenderer LBackTentacle5;
    public ModelRenderer LBackClaw;
    public ModelRenderer RBackTentacle3;
    public ModelRenderer RBackTentacle4;
    public ModelRenderer RBackTentacle5;
    public ModelRenderer RBackClaw;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer Tail5;
    public ModelRenderer TailClaw;
    public ModelRenderer LJaw;
    public ModelRenderer RJaw;
    public ModelRenderer LFrontPetal;
    public ModelRenderer RFrontPetal;
    public ModelRenderer LMiddlePetal;
    public ModelRenderer LBackPetal;
    public ModelRenderer TailPetal;
    public ModelRenderer RMiddlePetal;
    public ModelRenderer RBackPetal;
    public ModelRenderer Ovipositor;
    public ModelRenderer LFrontGrossTentacle;
    public ModelRenderer RFrontGrossTentacle;
    public ModelRenderer LMiddleGrossTentacle;
    public ModelRenderer LBackGrossTentacle;
    public ModelRenderer RMiddleGrossTentacle;
    public ModelRenderer RBackGrossTentacle;
    public ModelRenderer TailGrossTentacle;

    public ModelTrilobite()
    {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.TailGrossTentacle = new ModelRenderer(this, 110, 42);
        this.TailGrossTentacle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailGrossTentacle.addBox(2.5F, 10.0F, 4.0F, 1, 7, 1, 0.0F);
        this.setRotation(TailGrossTentacle, 0.24434609711170194F, -0.0F, 0.0F);
        this.RMiddleTentacle2 = new ModelRenderer(this, 65, 5);
        this.RMiddleTentacle2.setRotationPoint(-6.0F, 0.0F, 3.0F);
        this.RMiddleTentacle2.addBox(-6.900000095367432F, 7.699999809265137F, 0.30000001192092896F, 5, 2, 4, 0.0F);
        this.setRotation(RMiddleTentacle2, -0.10904049805153734F, 0.1791722243522077F, -0.5508564126797908F);
        this.RFrontPetal = new ModelRenderer(this, 81, 37);
        this.RFrontPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RFrontPetal.addBox(-7.5F, 7.599999904632568F, -0.800000011920929F, 4, 1, 2, 0.0F);
        this.setRotation(RFrontPetal, 0.4819954735191472F, -0.5514842894614982F, -0.7846320082018741F);
        this.RMiddleTentacle3 = new ModelRenderer(this, 65, 12);
        this.RMiddleTentacle3.setRotationPoint(-6.0F, 0.0F, 3.0F);
        this.RMiddleTentacle3.addBox(-14.0F, 4.699999809265137F, 0.699999988079071F, 5, 2, 3, 0.0F);
        this.setRotation(RMiddleTentacle3, -0.16815224652849992F, 0.12545319690528006F, -0.9356108406558161F);
        this.LMiddlePetal = new ModelRenderer(this, 97, 41);
        this.LMiddlePetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LMiddlePetal.addBox(9.800000190734863F, 2.299999952316284F, 2.0F, 3, 1, 2, 0.0F);
        this.setRotation(LMiddlePetal, -0.04675606933692445F, -0.05186240715992169F, 0.7342512400500987F);
        this.RBackClaw = new ModelRenderer(this, 105, 28);
        this.RBackClaw.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.RBackClaw.addBox(-4.0F, 21.700000762939453F, 4.0F, 0, 3, 2, 0.0F);
        this.setRotation(RBackClaw, 0.03552774401600698F, 0.469998124646395F, 0.0783201619013155F);
        this.LMiddleTentacle3 = new ModelRenderer(this, 46, 12);
        this.LMiddleTentacle3.setRotationPoint(6.0F, 0.0F, 3.0F);
        this.LMiddleTentacle3.addBox(12.0F, 0.5F, -1.0F, 5, 2, 3, 0.0F);
        this.setRotation(LMiddleTentacle3, -0.16815224652849992F, -0.12545319690528006F, 0.9356108406558161F);
        this.LMiddleGrossTentacle = new ModelRenderer(this, 110, 42);
        this.LMiddleGrossTentacle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LMiddleGrossTentacle.addBox(3.0F, 9.0F, 3.0F, 1, 7, 1, 0.0F);
        this.setRotation(LMiddleGrossTentacle, 0.0F, -0.0F, -0.17453292012214658F);
        this.Tail4 = new ModelRenderer(this, 45, 49);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail4.addBox(1.5F, -2.0F, 15.0F, 3, 2, 5, 0.0F);
        this.setRotation(Tail4, -1.151917338371277F, -0.0F, 0.0F);
        this.LBackTentacle5 = new ModelRenderer(this, 86, 24);
        this.LBackTentacle5.setRotationPoint(6.0F, 0.0F, 6.0F);
        this.LBackTentacle5.addBox(19.0F, -8.0F, 0.0F, 5, 1, 2, 0.0F);
        this.setRotation(LBackTentacle5, -0.5541198985650182F, -0.07381752739602657F, 1.4521705265521907F);
        this.bodyBack = new ModelRenderer(this, 25, 0);
        this.bodyBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyBack.addBox(0.5F, 4.5F, 7.0F, 5, 2, 4, 0.0F);
        this.setRotation(bodyBack, -0.33161255717277527F, -0.0F, 0.0F);
        this.RMiddleClaw = new ModelRenderer(this, 65, 28);
        this.RMiddleClaw.setRotationPoint(-6.0F, 0.0F, 3.0F);
        this.RMiddleClaw.addBox(-4.0F, 22.0F, 1.7000000476837158F, 0, 3, 2, 0.0F);
        this.setRotation(RMiddleClaw, 0.008564808564755865F, 0.12187395702642115F, 0.0703357332478492F);
        this.RFrontTentacle5 = new ModelRenderer(this, 19, 34);
        this.RFrontTentacle5.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RFrontTentacle5.addBox(-22.0F, -1.5F, -4.5F, 5, 1, 2, 0.0F);
        this.setRotation(RFrontTentacle5, 0.7027538926620808F, -0.14812220335672605F, -1.3982897038244428F);
        this.RMiddleTentacle4 = new ModelRenderer(this, 65, 18);
        this.RMiddleTentacle4.setRotationPoint(-6.0F, 0.0F, 3.0F);
        this.RMiddleTentacle4.addBox(-19.700000762939453F, 0.5F, 0.699999988079071F, 5, 2, 3, 0.0F);
        this.setRotation(RMiddleTentacle4, -0.19714346811493966F, 0.07117005563522394F, -1.2287715796255982F);
        this.RBackTentacle1 = new ModelRenderer(this, 105, 0);
        this.RBackTentacle1.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.RBackTentacle1.addBox(0.0F, 8.5F, 3.5F, 4, 2, 2, 0.0F);
        this.setRotation(RBackTentacle1, -0.17056384035982664F, 0.5344770444007052F, -0.32605590638170334F);
        this.RBackPetal = new ModelRenderer(this, 81, 45);
        this.RBackPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RBackPetal.addBox(-11.199999809265137F, 3.700000047683716F, 4.300000190734863F, 3, 1, 2, 0.0F);
        this.setRotation(RBackPetal, -0.5897064993326631F, 0.553282414912676F, -0.9050699374403737F);
        this.Ovipositor = new ModelRenderer(this, 55, 34);
        this.Ovipositor.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ovipositor.addBox(2.5F, 9.0F, 2.0F, 1, 9, 1, 0.0F);
        this.Tail3 = new ModelRenderer(this, 28, 49);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail3.addBox(1.5F, 4.0F, 10.0F, 3, 2, 5, 0.0F);
        this.setRotation(Tail3, -0.7504915595054628F, -0.0F, 0.0F);
        this.RFrontTentacle3 = new ModelRenderer(this, 19, 22);
        this.RFrontTentacle3.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RFrontTentacle3.addBox(-11.0F, 6.400000095367432F, -5.0F, 5, 2, 3, 0.0F);
        this.setRotation(RFrontTentacle3, 0.5268298052810044F, -0.5092778459605918F, -0.8731987347266162F);
        this.RBackTentacle4 = new ModelRenderer(this, 105, 18);
        this.RBackTentacle4.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.RBackTentacle4.addBox(-19.700000762939453F, 0.800000011920929F, 3.0F, 5, 2, 3, 0.0F);
        this.setRotation(RBackTentacle4, -0.5309434968024471F, 0.1822503026203217F, -1.2714097367244983F);
        this.LFrontTentacle1 = new ModelRenderer(this, 0, 10);
        this.LFrontTentacle1.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.LFrontTentacle1.addBox(1.0F, 6.5F, -0.8999999761581421F, 2, 2, 2, 0.0F);
        this.setRotation(LFrontTentacle1, 0.2889903578383988F, 0.6642818262320259F, 0.44935943526614924F);
        this.LFrontTentacle4 = new ModelRenderer(this, 0, 28);
        this.LFrontTentacle4.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.LFrontTentacle4.addBox(14.5F, -2.5F, -1.100000023841858F, 5, 2, 3, 0.0F);
        this.setRotation(LFrontTentacle4, 0.6672830318033137F, 0.28094374797956534F, 1.2324059730332162F);
        this.TailPetal = new ModelRenderer(this, 89, 50);
        this.TailPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailPetal.addBox(2.0F, -2.0F, 11.699999809265137F, 2, 1, 2, 0.0F);
        this.setRotation(TailPetal, -1.0122909545898438F, -0.0F, 0.0F);
        this.LMiddleTentacle2 = new ModelRenderer(this, 46, 5);
        this.LMiddleTentacle2.setRotationPoint(6.0F, 0.0F, 3.0F);
        this.LMiddleTentacle2.addBox(6.400000095367432F, 5.0F, -1.5F, 5, 2, 4, 0.0F);
        this.setRotation(LMiddleTentacle2, -0.10904049805153734F, -0.1791722243522077F, 0.5508564126797908F);
        this.RFrontTentacle2 = new ModelRenderer(this, 19, 15);
        this.RFrontTentacle2.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RFrontTentacle2.addBox(-3.5F, 8.0F, -5.5F, 5, 2, 4, 0.0F);
        this.setRotation(RFrontTentacle2, 0.2889903578383988F, -0.6642818262320259F, -0.44935943526614924F);
        this.LMiddleTentacle5 = new ModelRenderer(this, 46, 24);
        this.LMiddleTentacle5.setRotationPoint(6.0F, 0.0F, 3.0F);
        this.LMiddleTentacle5.addBox(19.0F, -8.0F, -0.5F, 5, 1, 2, 0.0F);
        this.setRotation(LMiddleTentacle5, -0.20745951912451563F, -0.02893975489563487F, 1.4341829218152156F);
        this.LMiddleTentacle1 = new ModelRenderer(this, 46, 0);
        this.LMiddleTentacle1.setRotationPoint(6.0F, 0.0F, 3.0F);
        this.LMiddleTentacle1.addBox(1.0F, 6.5F, -0.5F, 4, 2, 2, 0.0F);
        this.setRotation(LMiddleTentacle1, -0.05852163028266893F, -0.20121253565205766F, 0.2851619352811145F);
        this.LFrontTentacle5 = new ModelRenderer(this, 0, 34);
        this.LFrontTentacle5.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.LFrontTentacle5.addBox(18.0F, -6.0F, -0.5F, 5, 1, 2, 0.0F);
        this.setRotation(LFrontTentacle5, 0.7027538926620808F, 0.14812220335672605F, 1.3982897038244428F);
        this.Tail2 = new ModelRenderer(this, 9, 49);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail2.addBox(1.0F, 7.5F, 3.5F, 4, 2, 5, 0.0F);
        this.setRotation(Tail2, -0.36651915311813354F, -0.0F, 0.0F);
        this.LFrontTentacle2 = new ModelRenderer(this, 0, 15);
        this.LFrontTentacle2.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.LFrontTentacle2.addBox(3.0F, 6.5F, -1.7999999523162842F, 5, 2, 4, 0.0F);
        this.setRotation(LFrontTentacle2, 0.2889903578383988F, 0.6642818262320259F, 0.44935943526614924F);
        this.LFrontClaw = new ModelRenderer(this, 0, 38);
        this.LFrontClaw.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.LFrontClaw.addBox(9.0F, 21.700000762939453F, -0.5F, 0, 3, 2, 0.0F);
        this.setRotation(LFrontClaw, -0.06056421788540517F, 0.7134693983647046F, -0.09239015405794412F);
        this.LBackTentacle2 = new ModelRenderer(this, 86, 5);
        this.LBackTentacle2.setRotationPoint(6.0F, 0.0F, 6.0F);
        this.LBackTentacle2.addBox(5.0F, 6.300000190734863F, -0.800000011920929F, 5, 2, 4, 0.0F);
        this.setRotation(LBackTentacle2, -0.24888754127088275F, -0.505340410530155F, 0.4834501884885855F);
        this.RBackTentacle2 = new ModelRenderer(this, 105, 5);
        this.RBackTentacle2.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.RBackTentacle2.addBox(-5.5F, 8.5F, 2.700000047683716F, 5, 2, 4, 0.0F);
        this.setRotation(RBackTentacle2, -0.24888754127088275F, 0.505340410530155F, -0.4834501884885855F);
        this.LFrontGrossTentacle = new ModelRenderer(this, 110, 42);
        this.LFrontGrossTentacle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LFrontGrossTentacle.addBox(2.0F, 8.699999809265137F, 3.0F, 1, 7, 1, 0.0F);
        this.setRotation(LFrontGrossTentacle, -0.24434609711170194F, -0.0F, -0.17453292012214658F);
        this.RMiddleGrossTentacle = new ModelRenderer(this, 110, 42);
        this.RMiddleGrossTentacle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RMiddleGrossTentacle.addBox(2.0F, 8.0F, 3.5F, 1, 7, 1, 0.0F);
        this.setRotation(RMiddleGrossTentacle, 0.0F, -0.0F, 0.17453292012214658F);
        this.RMiddlePetal = new ModelRenderer(this, 81, 41);
        this.RMiddlePetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RMiddlePetal.addBox(-8.5F, 6.099999904632568F, 3.0F, 3, 1, 2, 0.0F);
        this.setRotation(RMiddlePetal, -0.04675606933692445F, 0.05186240715992169F, -0.7342512400500987F);
        this.TailClaw = new ModelRenderer(this, 69, 49);
        this.TailClaw.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.TailClaw.addBox(2.0F, 21.0F, 9.5F, 2, 3, 0, 0.0F);
        this.RFrontGrossTentacle = new ModelRenderer(this, 110, 42);
        this.RFrontGrossTentacle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RFrontGrossTentacle.addBox(3.0F, 8.0F, 3.0F, 1, 7, 1, 0.0F);
        this.setRotation(RFrontGrossTentacle, -0.24434609711170194F, -0.0F, 0.17453292012214658F);
        this.RBackGrossTentacle = new ModelRenderer(this, 110, 42);
        this.RBackGrossTentacle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RBackGrossTentacle.addBox(2.200000047683716F, 9.0F, 3.0F, 1, 7, 1, 0.0F);
        this.setRotation(RBackGrossTentacle, 0.24434609711170194F, -0.0F, 0.17453292012214658F);
        this.LJaw = new ModelRenderer(this, 30, 43);
        this.LJaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LJaw.addBox(-0.20000000298023224F, 9.0F, 1.5F, 1, 1, 2, 0.0F);
        this.setRotation(LJaw, 0.03276210248099374F, -0.08089760428553075F, -0.3852984655959346F);
        this.LBackTentacle3 = new ModelRenderer(this, 86, 12);
        this.LBackTentacle3.setRotationPoint(6.0F, 0.0F, 6.0F);
        this.LBackTentacle3.addBox(11.399999618530273F, 0.800000011920929F, -0.5F, 5, 2, 3, 0.0F);
        this.setRotation(LBackTentacle3, -0.4628815966587863F, -0.32458276980645206F, 1.0021573257291503F);
        this.LBackGrossTentacle = new ModelRenderer(this, 110, 42);
        this.LBackGrossTentacle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBackGrossTentacle.addBox(1.5F, 10.0F, 2.5F, 1, 7, 1, 0.0F);
        this.setRotation(LBackGrossTentacle, 0.24434609711170194F, -0.0F, -0.17453292012214658F);
        this.LBackPetal = new ModelRenderer(this, 97, 45);
        this.LBackPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBackPetal.addBox(11.0F, 1.2999999523162842F, 0.0F, 3, 1, 2, 0.0F);
        this.setRotation(LBackPetal, -0.5897064993326631F, -0.553282414912676F, 0.9050699374403737F);
        this.LBackClaw = new ModelRenderer(this, 86, 28);
        this.LBackClaw.setRotationPoint(6.0F, 0.0F, 6.0F);
        this.LBackClaw.addBox(9.199999809265137F, 21.700000762939453F, 1.0F, 0, 3, 2, 0.0F);
        this.setRotation(LBackClaw, 0.03552774401600698F, -0.469998124646395F, -0.0783201619013155F);
        this.LMiddleTentacle4 = new ModelRenderer(this, 46, 18);
        this.LMiddleTentacle4.setRotationPoint(6.0F, 0.0F, 3.0F);
        this.LMiddleTentacle4.addBox(16.0F, -4.300000190734863F, -1.0F, 5, 2, 3, 0.0F);
        this.setRotation(LMiddleTentacle4, -0.19714346811493966F, -0.07117005563522394F, 1.2287715796255982F);
        this.RMiddleTentacle5 = new ModelRenderer(this, 65, 24);
        this.RMiddleTentacle5.setRotationPoint(-6.0F, 0.0F, 3.0F);
        this.RMiddleTentacle5.addBox(-24.0F, -3.0F, 1.2000000476837158F, 5, 1, 2, 0.0F);
        this.setRotation(RMiddleTentacle5, -0.20745951912451563F, 0.02893975489563487F, -1.4341829218152156F);
        this.RFrontTentacle4 = new ModelRenderer(this, 19, 28);
        this.RFrontTentacle4.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RFrontTentacle4.addBox(-17.5F, 1.7000000476837158F, -5.0F, 5, 2, 3, 0.0F);
        this.setRotation(RFrontTentacle4, 0.6672830318033137F, -0.28094374797956534F, -1.2324059730332162F);
        this.RBackTentacle5 = new ModelRenderer(this, 105, 24);
        this.RBackTentacle5.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.RBackTentacle5.addBox(-24.0F, -2.9000000953674316F, 3.5F, 5, 1, 2, 0.0F);
        this.setRotation(RBackTentacle5, -0.5541198985650182F, 0.07381752739602657F, -1.4521705265521907F);
        this.RBackTentacle3 = new ModelRenderer(this, 105, 12);
        this.RBackTentacle3.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.RBackTentacle3.addBox(-14.0F, 5.0F, 3.0F, 5, 2, 3, 0.0F);
        this.setRotation(RBackTentacle3, -0.4628815966587863F, 0.32458276980645206F, -1.0021573257291503F);
        this.LFrontTentacle3 = new ModelRenderer(this, 0, 22);
        this.LFrontTentacle3.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.LFrontTentacle3.addBox(9.5F, 3.299999952316284F, -1.2000000476837158F, 5, 2, 3, 0.0F);
        this.setRotation(LFrontTentacle3, 0.5268298052810044F, 0.5092778459605918F, 0.8731987347266162F);
        this.LBackTentacle1 = new ModelRenderer(this, 86, 0);
        this.LBackTentacle1.setRotationPoint(6.0F, 0.0F, 6.0F);
        this.LBackTentacle1.addBox(1.0F, 7.0F, 0.0F, 4, 2, 2, 0.0F);
        this.setRotation(LBackTentacle1, -0.17056384035982664F, -0.5344770444007052F, 0.32605590638170334F);
        this.LFrontPetal = new ModelRenderer(this, 97, 37);
        this.LFrontPetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LFrontPetal.addBox(7.199999809265137F, 4.900000095367432F, 3.0F, 4, 1, 2, 0.0F);
        this.setRotation(LFrontPetal, 0.4819954735191472F, 0.5514842894614982F, 0.7846320082018741F);
        this.RFrontClaw = new ModelRenderer(this, 19, 38);
        this.RFrontClaw.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RFrontClaw.addBox(-4.5F, 21.0F, -4.5F, 0, 3, 2, 0.0F);
        this.setRotation(RFrontClaw, -0.06056421788540517F, -0.7134693983647046F, 0.09239015405794412F);
        this.Tail5 = new ModelRenderer(this, 62, 49);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail5.addBox(2.0F, 18.0F, 7.0F, 2, 5, 1, 0.0F);
        this.setRotation(Tail5, 0.08726646006107329F, -0.0F, 0.0F);
        this.RFrontTentacle1 = new ModelRenderer(this, 19, 10);
        this.RFrontTentacle1.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RFrontTentacle1.addBox(1.0F, 8.0F, -4.699999809265137F, 2, 2, 2, 0.0F);
        this.setRotation(RFrontTentacle1, 0.2889903578383988F, -0.6642818262320259F, -0.44935943526614924F);
        this.Tail1 = new ModelRenderer(this, 0, 49);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail1.addBox(2.0F, 7.5F, 2.0F, 2, 2, 2, 0.0F);
        this.setRotation(Tail1, -0.36651915311813354F, -0.0F, 0.0F);
        this.LMiddleClaw = new ModelRenderer(this, 46, 28);
        this.LMiddleClaw.setRotationPoint(6.0F, 0.0F, 3.0F);
        this.LMiddleClaw.addBox(9.100000381469727F, 21.700000762939453F, 0.5F, 0, 3, 2, 0.0F);
        this.setRotation(LMiddleClaw, 0.008564808564755865F, -0.12187395702642115F, -0.0703357332478492F);
        this.LBackTentacle4 = new ModelRenderer(this, 86, 18);
        this.LBackTentacle4.setRotationPoint(6.0F, 0.0F, 6.0F);
        this.LBackTentacle4.addBox(15.699999809265137F, -4.0F, -0.5F, 5, 2, 3, 0.0F);
        this.setRotation(LBackTentacle4, -0.5309434968024471F, -0.1822503026203217F, 1.2714097367244983F);
        this.RJaw = new ModelRenderer(this, 37, 43);
        this.RJaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RJaw.addBox(4.800000190734863F, 6.699999809265137F, 2.0F, 1, 1, 2, 0.0F);
        this.setRotation(RJaw, 0.03276210248099374F, 0.08089760428553075F, 0.3852984655959346F);
        this.RMiddleTentacle1 = new ModelRenderer(this, 65, 0);
        this.RMiddleTentacle1.setRotationPoint(-6.0F, 0.0F, 3.0F);
        this.RMiddleTentacle1.addBox(0.0F, 8.0F, 1.2000000476837158F, 5, 2, 2, 0.0F);
        this.setRotation(RMiddleTentacle1, -0.05852163028266893F, 0.20121253565205766F, -0.2851619352811145F);
        this.bodyFront = new ModelRenderer(this, 0, 0);
        this.bodyFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyFront.addBox(0.0F, 6.0F, 0.0F, 6, 3, 6, 0.0F);

        /** New ModelRenderers **/
        this.RMiddleTentacle3 = new ModelRenderer(this, 65, 12);
        this.RMiddleTentacle3.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.RMiddleTentacle3.addBox(-5.5F, -1.0F, -1.5F, 5, 2, 3, 0.0F);
        this.RMiddleTentacle4 = new ModelRenderer(this, 65, 18);
        this.RMiddleTentacle4.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.RMiddleTentacle4.addBox(-6.0F, -1.0F, -1.5F, 5, 2, 3, 0.0F);
        this.RMiddleTentacle2 = new ModelRenderer(this, 65, 5);
        this.RMiddleTentacle2.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.RMiddleTentacle2.addBox(-5.0F, -1.0F, -2.0F, 5, 2, 4, 0.0F);
        this.RMiddleTentacle5 = new ModelRenderer(this, 65, 24);
        this.RMiddleTentacle5.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RMiddleTentacle5.addBox(-5.0F, -0.5F, -1.0F, 5, 1, 2, 0.0F);
        this.RMiddleTentacle1 = new ModelRenderer(this, 65, 0);
        this.RMiddleTentacle1.setRotationPoint(3.0F, 7.5F, 3.0F);
        this.RMiddleTentacle1.addBox(-7.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
        this.RMiddleClaw = new ModelRenderer(this, 65, 28);
        this.RMiddleClaw.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.RMiddleClaw.addBox(0.0F, 0.5F, -1.0F, 0, 3, 2, 0.0F);
        this.setRotation(RMiddleClaw, 0.0F, 0.0F, 1.5707963267948966F);
        this.RMiddleTentacle5.addChild(this.RMiddleClaw);
        this.RMiddleTentacle4.addChild(this.RMiddleTentacle5);
        this.RMiddleTentacle1.addChild(this.RMiddleTentacle2);
        this.RMiddleTentacle2.addChild(this.RMiddleTentacle3);
        this.RMiddleTentacle3.addChild(this.RMiddleTentacle4);
    }

    @Override
    public void render(Object obj)
    {
        EntityLivingBase base = (EntityLivingBase) obj;;
        float legMovementLeft = (MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1F * swingProgressPrev(obj) * 0.25F) * 90;
        float legMovementRight = -(MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1F * swingProgressPrev(obj) * 0.25F) * 90;
        
        OpenGL.translate(0, 0.45F + this.RMiddleTentacle1.rotateAngleZ, 0F);

        /** Inner Tentacles **/
        // draw(TailGrossTentacle);
        // draw(LFrontGrossTentacle);
        // draw(LMiddleGrossTentacle);
        // draw(LBackGrossTentacle);
        // draw(RFrontGrossTentacle);
        // draw(RMiddleGrossTentacle);
        // draw(RBackGrossTentacle);

        /** Render All 7 Tentacles**/
        OpenGL.pushMatrix();
        {
            OpenGL.translate(0, 0, 0.4F);
            OpenGL.rotate(90, 0, 1, 0);
            OpenGL.rotate((MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F) * 20 + legMovementLeft, 0, 1, 0);
            draw(RMiddleTentacle1);
        }
        OpenGL.popMatrix();
        OpenGL.pushMatrix();
        {
            OpenGL.translate(0, 0, 0F);
            OpenGL.rotate(0, 0, 1, 0);
            OpenGL.rotate((MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F) * 20 + legMovementLeft, 0, 1, 0);
            draw(RMiddleTentacle1);
        }
        OpenGL.popMatrix();
        OpenGL.pushMatrix();
        {
            OpenGL.translate(0, 0, 0.2F);
            OpenGL.rotate(35, 0, 1, 0);
            OpenGL.rotate((MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F) * 20 + legMovementRight, 0, 1, 0);
            draw(RMiddleTentacle1);
        }
        OpenGL.popMatrix();
        OpenGL.pushMatrix();
        {
            OpenGL.translate(0.2, 0, -0.1F);
            OpenGL.rotate(-45, 0, 1, 0);
            OpenGL.rotate((MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F) * 20 + legMovementRight, 0, 1, 0);
            draw(RMiddleTentacle1);
        }
        OpenGL.popMatrix();
        OpenGL.pushMatrix();
        {
            OpenGL.scale(-1, 1, 1);
            OpenGL.translate(-0.4, 0, 0F);
            OpenGL.rotate(0, 0, 1, 0);
            OpenGL.rotate((MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F) * 20 + legMovementLeft, 0, 1, 0);
            draw(RMiddleTentacle1);
        }
        OpenGL.popMatrix();
        OpenGL.pushMatrix();
        {
            OpenGL.scale(-1, 1, 1);
            OpenGL.translate(-0.4, 0, 0.2F);
            OpenGL.rotate(35, 0, 1, 0);
            OpenGL.rotate((MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F) * 20 + legMovementRight, 0, 1, 0);
            draw(RMiddleTentacle1);
        }
        OpenGL.popMatrix();
        OpenGL.pushMatrix();
        {
            OpenGL.scale(-1, 1, 1);
            OpenGL.translate(-0.2, 0, -0.1F);
            OpenGL.rotate(-45, 0, 1, 0);
            OpenGL.rotate((MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F) * 20 + legMovementRight, 0, 1, 0);
            draw(RMiddleTentacle1);
        }
        OpenGL.popMatrix();

        this.RMiddleTentacle1.rotateAngleZ = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1F * swingProgressPrev(obj) * 0.25F;
        this.RMiddleTentacle2.rotateAngleZ = -0.1F;
        this.RMiddleTentacle3.rotateAngleZ = -0.1F;
        this.RMiddleTentacle4.rotateAngleZ = -0.1F;
        this.RMiddleTentacle5.rotateAngleZ = -0.1F;

        this.RMiddleTentacle1.rotateAngleZ += MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F;
        this.RMiddleTentacle2.rotateAngleZ += MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F;
        this.RMiddleTentacle3.rotateAngleZ -= MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F;
        this.RMiddleTentacle4.rotateAngleZ -= MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F;
        this.RMiddleTentacle5.rotateAngleZ -= MathHelper.sin(idleProgress(obj) * 0.1F) * 0.4F;
        this.RMiddleClaw.rotateAngleZ = (float) Math.toRadians(80);

        /** Petals **/
        draw(TailPetal);

        draw(RFrontPetal);
        draw(RMiddlePetal);
        draw(RBackPetal);

        draw(LFrontPetal);
        draw(LMiddlePetal);
        draw(LBackPetal);

        /** Body Area **/
        // draw(Ovipositor);
        draw(bodyBack);
        draw(LJaw);
        draw(RJaw);
        draw(bodyFront);        
    }
}
