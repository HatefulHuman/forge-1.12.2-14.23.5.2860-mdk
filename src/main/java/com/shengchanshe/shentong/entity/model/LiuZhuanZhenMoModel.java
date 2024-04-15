package com.shengchanshe.shentong.entity.model;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class LiuZhuanZhenMoModel extends ModelBase {
	private final ModelRenderer zhuan4;
	private final ModelRenderer hand10;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer bone19;
	private final ModelRenderer Head_r3;
	private final ModelRenderer bone20;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Head_r5;
	private final ModelRenderer Head_r6;
	private final ModelRenderer bone21;
	private final ModelRenderer Head_r7;
	private final ModelRenderer Head_r8;
	private final ModelRenderer Head_r9;
	private final ModelRenderer bone22;
	private final ModelRenderer Head_r10;
	private final ModelRenderer Head_r11;
	private final ModelRenderer Head_r12;
	private final ModelRenderer bone23;
	private final ModelRenderer Head_r13;
	private final ModelRenderer Head_r14;
	private final ModelRenderer bone24;
	private final ModelRenderer Head_r15;
	private final ModelRenderer Head_r16;
	private final ModelRenderer bone25;
	private final ModelRenderer Head_r17;
	private final ModelRenderer Head_r18;
	private final ModelRenderer body4;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Body_r5;
	private final ModelRenderer Body_r6;
	private final ModelRenderer rightarm4;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer RightArm_r3;
	private final ModelRenderer hand11;
	private final ModelRenderer RightArm_r4;
	private final ModelRenderer RightArm_r5;
	private final ModelRenderer RightArm_r6;
	private final ModelRenderer RightArm_r7;
	private final ModelRenderer RightArm_r8;
	private final ModelRenderer RightArm_r9;
	private final ModelRenderer RightArm_r10;
	private final ModelRenderer bone26;
	private final ModelRenderer RightArm_r11;
	private final ModelRenderer RightArm_r12;
	private final ModelRenderer bone3;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer hand13;
	private final ModelRenderer LeftArm_r3;
	private final ModelRenderer LeftArm_r4;
	private final ModelRenderer bone4;
	private final ModelRenderer RightArm_r13;
	private final ModelRenderer RightArm_r14;
	private final ModelRenderer hand14;
	private final ModelRenderer RightArm_r15;
	private final ModelRenderer RightArm_r16;
	private final ModelRenderer leftarm4;
	private final ModelRenderer LeftArm_r5;
	private final ModelRenderer bone2;
	private final ModelRenderer LeftArm_r6;
	private final ModelRenderer LeftArm_r7;
	private final ModelRenderer hand12;
	private final ModelRenderer LeftArm_r8;
	private final ModelRenderer LeftArm_r9;
	private final ModelRenderer LeftArm_r10;
	private final ModelRenderer LeftArm_r11;
	private final ModelRenderer LeftArm_r12;
	private final ModelRenderer LeftArm_r13;
	private final ModelRenderer LeftArm_r14;
	private final ModelRenderer bone5;
	private final ModelRenderer hand15;
	private final ModelRenderer bone10;
	private final ModelRenderer RightArm_r17;
	private final ModelRenderer RightArm_r18;
	private final ModelRenderer hand17;
	private final ModelRenderer RightArm_r19;
	private final ModelRenderer RightArm_r20;
	private final ModelRenderer RightArm_r21;
	private final ModelRenderer RightArm_r22;
	private final ModelRenderer RightArm_r23;
	private final ModelRenderer RightArm_r24;
	private final ModelRenderer RightArm_r25;
	private final ModelRenderer bone6;
	private final ModelRenderer LeftArm_r15;
	private final ModelRenderer LeftArm_r16;
	private final ModelRenderer hand16;
	private final ModelRenderer LeftArm_r17;
	private final ModelRenderer LeftArm_r18;
	private final ModelRenderer LeftArm_r19;
	private final ModelRenderer LeftArm_r20;
	private final ModelRenderer LeftArm_r21;
	private final ModelRenderer LeftArm_r22;
	private final ModelRenderer LeftArm_r23;

	public LiuZhuanZhenMoModel() {
		textureWidth = 256;
		textureHeight = 256;

		zhuan4 = new ModelRenderer(this);
		zhuan4.setRotationPoint(0.0F, 9.0F, 7.0F);
		setRotationAngle(zhuan4, 0.3491F, 0.0F, 0.0F);
		

		hand10 = new ModelRenderer(this);
		hand10.setRotationPoint(0.0F, -9.0F, 10.0F);
		zhuan4.addChild(hand10);
		setRotationAngle(hand10, -0.3491F, 0.0F, 0.0F);
		hand10.cubeList.add(new ModelBox(hand10, 46, 30, -5.0F, -25.0F, -23.0F, 10, 8, 11, 0.0F, false));
		hand10.cubeList.add(new ModelBox(hand10, 46, 49, -6.0F, -27.0F, -18.0F, 12, 11, 8, 0.0F, false));
		hand10.cubeList.add(new ModelBox(hand10, 68, 68, -5.0F, -26.0F, -17.0F, 10, 9, 8, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 24.3F, -29.0F);
		hand10.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1615F, 0.0665F, 0.3873F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -21.0F, -41.6F, -2.4F, 3, 0, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.0F, -19.7F, -23.0F);
		hand10.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4391F, 0.2974F, 0.4335F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 14, -0.3474F, -0.8523F, -0.3683F, 2, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.0F, -19.7F, -23.0F);
		hand10.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4391F, -0.2974F, -0.4335F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 14, -1.6526F, -0.8523F, -0.3683F, 2, 1, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 24.3F, -29.0F);
		hand10.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1615F, -0.0665F, -0.3873F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 13, 18.0F, -41.6F, -2.4F, 3, 0, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 24.3F, -29.0F);
		hand10.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 93, 17, -1.0F, -45.8F, -2.4F, 2, 4, 1, 0.0F, false));

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 2.0F, 0.0F);
		hand10.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.3491F, 0.0F, 0.0F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 122, 102, -4.5F, -25.3F, -15.3F, 9, 3, 6, 0.0F, false));
		Head_r1.cubeList.add(new ModelBox(Head_r1, 26, 106, -5.0F, -33.4F, -13.4F, 10, 4, 7, 0.0F, false));

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(0.0F, 2.0F, 0.0F);
		hand10.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0873F, 0.0F, 0.0F);
		Head_r2.cubeList.add(new ModelBox(Head_r2, 0, 106, -5.0F, -25.0F, -11.0F, 10, 19, 3, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 2.0F, 6.0F);
		hand10.addChild(bone19);
		

		Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0873F, 0.0F, 0.0F);
		Head_r3.cubeList.add(new ModelBox(Head_r3, 110, 88, -5.0F, -37.0F, -4.0F, 9, 9, 5, 0.0F, false));
		Head_r3.cubeList.add(new ModelBox(Head_r3, 112, 34, -15.0F, -27.0F, -4.0F, 9, 9, 5, 0.0F, false));
		Head_r3.cubeList.add(new ModelBox(Head_r3, 26, 118, 6.0F, -27.0F, -4.0F, 9, 9, 5, 0.0F, false));
		Head_r3.cubeList.add(new ModelBox(Head_r3, 0, 41, -10.0F, -32.0F, -3.0F, 20, 20, 3, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -14.0F, 0.0F);
		bone19.addChild(bone20);
		

		Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(-0.25F, -4.0F, 0.0F);
		bone20.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0873F, 0.0F, 0.0F);
		Head_r4.cubeList.add(new ModelBox(Head_r4, 78, 150, -2.0F, -29.0F, -5.0F, 4, 16, 3, 0.0F, false));

		Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(-0.25F, -4.0F, 0.0F);
		bone20.addChild(Head_r5);
		setRotationAngle(Head_r5, 0.0852F, 0.0189F, -0.2174F);
		Head_r5.cubeList.add(new ModelBox(Head_r5, 120, 158, -2.0F, -26.0F, -5.0F, 4, 10, 3, 0.0F, false));

		Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(-0.25F, -4.0F, 0.0F);
		bone20.addChild(Head_r6);
		setRotationAngle(Head_r6, 0.0852F, -0.0189F, 0.2174F);
		Head_r6.cubeList.add(new ModelBox(Head_r6, 134, 158, -2.0F, -26.0F, -5.0F, 4, 10, 3, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-2.0F, -14.0F, 0.0F);
		bone19.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.0F, 1.0472F);
		

		Head_r7 = new ModelRenderer(this);
		Head_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(Head_r7);
		setRotationAngle(Head_r7, 0.0873F, 0.0F, 0.0F);
		Head_r7.cubeList.add(new ModelBox(Head_r7, 64, 150, -2.0F, -28.8911F, -3.7548F, 4, 16, 3, 0.0F, false));

		Head_r8 = new ModelRenderer(this);
		Head_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(Head_r8);
		setRotationAngle(Head_r8, 0.0852F, 0.0189F, -0.2174F);
		Head_r8.cubeList.add(new ModelBox(Head_r8, 154, 0, -2.0236F, -25.8936F, -3.7548F, 4, 10, 3, 0.0F, false));

		Head_r9 = new ModelRenderer(this);
		Head_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(Head_r9);
		setRotationAngle(Head_r9, 0.0852F, -0.0189F, 0.2174F);
		Head_r9.cubeList.add(new ModelBox(Head_r9, 157, 133, -1.9764F, -25.8936F, -3.7548F, 4, 10, 3, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(2.0F, -14.0F, 0.0F);
		bone19.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -1.0472F);
		

		Head_r10 = new ModelRenderer(this);
		Head_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(Head_r10);
		setRotationAngle(Head_r10, 0.0873F, 0.0F, 0.0F);
		Head_r10.cubeList.add(new ModelBox(Head_r10, 92, 150, -2.0F, -27.8911F, -3.7548F, 4, 15, 3, 0.0F, false));

		Head_r11 = new ModelRenderer(this);
		Head_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(Head_r11);
		setRotationAngle(Head_r11, 0.0852F, -0.0189F, 0.2174F);
		Head_r11.cubeList.add(new ModelBox(Head_r11, 0, 0, -1.9764F, -25.8936F, -3.7548F, 4, 10, 3, 0.0F, false));

		Head_r12 = new ModelRenderer(this);
		Head_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(Head_r12);
		setRotationAngle(Head_r12, 0.0852F, 0.0189F, -0.2174F);
		Head_r12.cubeList.add(new ModelBox(Head_r12, 106, 150, -2.0236F, -25.8936F, -3.7548F, 4, 10, 3, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(2.0F, -18.0F, -20.8F);
		hand10.addChild(bone23);
		

		Head_r13 = new ModelRenderer(this);
		Head_r13.setRotationPoint(-4.0F, 0.0F, -2.0F);
		bone23.addChild(Head_r13);
		setRotationAngle(Head_r13, -1.5708F, -1.0036F, 1.309F);
		Head_r13.cubeList.add(new ModelBox(Head_r13, 156, 78, 0.9473F, -7.217F, 1.0F, 3, 5, 3, 0.0F, false));

		Head_r14 = new ModelRenderer(this);
		Head_r14.setRotationPoint(0.0F, 0.0F, -2.0F);
		bone23.addChild(Head_r14);
		setRotationAngle(Head_r14, -1.5708F, 1.0036F, -1.309F);
		Head_r14.cubeList.add(new ModelBox(Head_r14, 156, 78, -3.9473F, -7.217F, 1.0F, 3, 5, 3, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-2.6F, -13.0F, -3.0F);
		bone23.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, -0.5236F);
		

		Head_r15 = new ModelRenderer(this);
		Head_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(Head_r15);
		setRotationAngle(Head_r15, 1.2654F, 1.0036F, 1.309F);
		Head_r15.cubeList.add(new ModelBox(Head_r15, 46, 49, 5.0527F, 3.217F, 13.0F, 2, 6, 2, 0.0F, false));
		Head_r15.cubeList.add(new ModelBox(Head_r15, 0, 64, 4.0527F, 6.217F, 10.0F, 3, 7, 3, 0.0F, false));

		Head_r16 = new ModelRenderer(this);
		Head_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(Head_r16);
		setRotationAngle(Head_r16, 1.5708F, 1.0036F, 1.309F);
		Head_r16.cubeList.add(new ModelBox(Head_r16, 108, 23, 4.0527F, 12.217F, 4.0F, 3, 4, 3, 0.0F, false));
		Head_r16.cubeList.add(new ModelBox(Head_r16, 86, 58, 2.0527F, 8.217F, 1.0F, 4, 7, 3, 0.0F, false));
		Head_r16.cubeList.add(new ModelBox(Head_r16, 146, 95, -1.9473F, 5.217F, -3.0F, 7, 7, 4, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-1.4F, -13.0F, -3.0F);
		bone23.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, 0.5236F);
		

		Head_r17 = new ModelRenderer(this);
		Head_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(Head_r17);
		setRotationAngle(Head_r17, 1.2654F, -1.0036F, -1.309F);
		Head_r17.cubeList.add(new ModelBox(Head_r17, 45, 0, -7.0527F, 3.217F, 13.0F, 2, 6, 2, 0.0F, false));
		Head_r17.cubeList.add(new ModelBox(Head_r17, 0, 64, -7.0527F, 6.217F, 10.0F, 3, 7, 3, 0.0F, false));

		Head_r18 = new ModelRenderer(this);
		Head_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(Head_r18);
		setRotationAngle(Head_r18, 1.5708F, -1.0036F, -1.309F);
		Head_r18.cubeList.add(new ModelBox(Head_r18, 53, 106, -7.0527F, 12.217F, 4.0F, 3, 4, 3, 0.0F, false));
		Head_r18.cubeList.add(new ModelBox(Head_r18, 86, 58, -6.0527F, 8.217F, 1.0F, 4, 7, 3, 0.0F, false));
		Head_r18.cubeList.add(new ModelBox(Head_r18, 21, 64, -5.0527F, 5.217F, -3.0F, 7, 7, 4, 0.0F, false));

		body4 = new ModelRenderer(this);
		body4.setRotationPoint(0.0F, -14.0F, 16.0F);
		zhuan4.addChild(body4);
		body4.cubeList.add(new ModelBox(body4, 0, 21, -7.0F, -13.0F, -23.5F, 14, 8, 11, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 45, 0, -7.0F, -5.0F, -22.0F, 14, 4, 9, 0.0F, false));

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 6.0F, 0.0F);
		body4.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.2182F, 0.0F, 0.0F);
		Body_r1.cubeList.add(new ModelBox(Body_r1, 54, 13, -5.0F, -7.0F, -23.0F, 10, 9, 8, 0.0F, false));

		Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body4.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 0.0F, -0.3054F);
		Body_r2.cubeList.add(new ModelBox(Body_r2, 34, 75, 3.2F, -2.5F, -12.3F, 4, 3, 2, 0.0F, false));

		Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		body4.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 0.0F, 0.3054F);
		Body_r3.cubeList.add(new ModelBox(Body_r3, 34, 75, -7.2F, -2.5F, -12.3F, 4, 3, 2, 0.0F, false));

		Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		body4.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.0F, 0.0F, -0.3491F);
		Body_r4.cubeList.add(new ModelBox(Body_r4, 0, 64, -5.0F, -16.0F, -23.3F, 4, 12, 13, 0.0F, false));

		Body_r5 = new ModelRenderer(this);
		Body_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		body4.addChild(Body_r5);
		setRotationAngle(Body_r5, 0.0F, 0.0F, 0.3491F);
		Body_r5.cubeList.add(new ModelBox(Body_r5, 0, 64, 1.0F, -16.0F, -23.3F, 4, 12, 13, 0.0F, false));

		Body_r6 = new ModelRenderer(this);
		Body_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		body4.addChild(Body_r6);
		setRotationAngle(Body_r6, 0.0873F, 0.0F, 0.0F);
		Body_r6.cubeList.add(new ModelBox(Body_r6, 0, 0, -7.0F, -17.4F, -23.0F, 14, 4, 17, 0.0F, false));

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(-8.5F, -24.0F, 1.3F);
		zhuan4.addChild(rightarm4);
		setRotationAngle(rightarm4, -0.0366F, 0.0841F, 0.1201F);
		

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(0.5F, 2.0F, -2.0F);
		rightarm4.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 54, 118, -17.0F, -4.0F, -1.0F, 2, 5, 1, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 148, 158, -15.0F, -2.0F, -2.0F, 3, 6, 3, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 147, 106, -13.0F, 0.0F, -3.0F, 4, 6, 5, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 82, 22, -8.6798F, -2.0158F, -5.5231F, 9, 9, 8, 0.0F, false));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 60, 85, -10.0F, -4.0F, -4.0F, 9, 9, 8, 0.0F, false));

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(-10.0F, 11.0F, -4.0F);
		rightarm4.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, -1.2238F, 0.2129F, 0.3838F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 96, 135, -2.5228F, -0.3283F, -5.634F, 6, 9, 6, 0.0F, false));

		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setRotationPoint(-2.0F, 4.0F, -3.0F);
		rightarm4.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r3.cubeList.add(new ModelBox(RightArm_r3, 0, 128, -7.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F, false));

		hand11 = new ModelRenderer(this);
		hand11.setRotationPoint(-11.2F, 10.6F, -12.5F);
		rightarm4.addChild(hand11);
		setRotationAngle(hand11, -1.4715F, -0.1737F, -1.1615F);
		

		RightArm_r4 = new ModelRenderer(this);
		RightArm_r4.setRotationPoint(7.5949F, -5.5246F, 2.8009F);
		hand11.addChild(RightArm_r4);
		setRotationAngle(RightArm_r4, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r4.cubeList.add(new ModelBox(RightArm_r4, 96, 105, -8.0F, 8.0F, -5.0F, 8, 3, 10, 0.0F, false));

		RightArm_r5 = new ModelRenderer(this);
		RightArm_r5.setRotationPoint(-0.4051F, -1.0246F, -1.0991F);
		hand11.addChild(RightArm_r5);
		setRotationAngle(RightArm_r5, -0.3109F, -0.2909F, -0.5451F);
		RightArm_r5.cubeList.add(new ModelBox(RightArm_r5, 138, 95, -8.9117F, 5.6207F, 3.1749F, 3, 6, 1, 0.0F, false));

		RightArm_r6 = new ModelRenderer(this);
		RightArm_r6.setRotationPoint(-0.4051F, -1.0246F, -1.0991F);
		hand11.addChild(RightArm_r6);
		setRotationAngle(RightArm_r6, -0.3981F, -0.2909F, -0.5451F);
		RightArm_r6.cubeList.add(new ModelBox(RightArm_r6, 26, 89, -8.9117F, 5.3207F, 1.6749F, 3, 6, 1, 0.0F, false));

		RightArm_r7 = new ModelRenderer(this);
		RightArm_r7.setRotationPoint(-0.4051F, -1.0246F, -1.0991F);
		hand11.addChild(RightArm_r7);
		setRotationAngle(RightArm_r7, -0.4418F, -0.2909F, -0.5451F);
		RightArm_r7.cubeList.add(new ModelBox(RightArm_r7, 160, 117, -8.9117F, 5.3207F, -0.1251F, 3, 6, 1, 0.0F, false));

		RightArm_r8 = new ModelRenderer(this);
		RightArm_r8.setRotationPoint(-0.4051F, -1.0246F, -1.0991F);
		hand11.addChild(RightArm_r8);
		setRotationAngle(RightArm_r8, -0.5727F, -0.2909F, -0.5451F);
		RightArm_r8.cubeList.add(new ModelBox(RightArm_r8, 160, 158, -8.9117F, 5.3207F, -1.1251F, 3, 6, 1, 0.0F, false));

		RightArm_r9 = new ModelRenderer(this);
		RightArm_r9.setRotationPoint(-0.4051F, -1.0246F, -0.0991F);
		hand11.addChild(RightArm_r9);
		setRotationAngle(RightArm_r9, -0.5727F, -0.2909F, -0.5451F);
		RightArm_r9.cubeList.add(new ModelBox(RightArm_r9, 26, 106, -4.9117F, 3.3207F, -4.1251F, 2, 5, 1, 0.0F, false));

		RightArm_r10 = new ModelRenderer(this);
		RightArm_r10.setRotationPoint(-0.4051F, -1.0246F, -0.0991F);
		hand11.addChild(RightArm_r10);
		setRotationAngle(RightArm_r10, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r10.cubeList.add(new ModelBox(RightArm_r10, 146, 46, -0.9037F, 1.9995F, -3.1715F, 4, 9, 7, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-5.1051F, 0.9754F, 3.2009F);
		hand11.addChild(bone26);
		setRotationAngle(bone26, 0.0734F, 0.6198F, -0.7148F);
		

		RightArm_r11 = new ModelRenderer(this);
		RightArm_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(RightArm_r11);
		setRotationAngle(RightArm_r11, -0.4295F, 0.3093F, 0.5865F);
		RightArm_r11.cubeList.add(new ModelBox(RightArm_r11, 66, 68, 8.7963F, 7.2995F, -1.6715F, 1, 1, 4, 0.0F, false));
		RightArm_r11.cubeList.add(new ModelBox(RightArm_r11, 55, 68, 7.7963F, 0.2995F, -2.1715F, 3, 2, 5, 0.0F, false));
		RightArm_r11.cubeList.add(new ModelBox(RightArm_r11, 40, 21, 7.7963F, 2.2995F, -2.1715F, 1, 6, 5, 0.0F, false));

		RightArm_r12 = new ModelRenderer(this);
		RightArm_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone26.addChild(RightArm_r12);
		setRotationAngle(RightArm_r12, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r12.cubeList.add(new ModelBox(RightArm_r12, 60, 126, 9.0963F, 8.9995F, -1.6715F, 1, 1, 4, 0.0F, false));
		RightArm_r12.cubeList.add(new ModelBox(RightArm_r12, 54, 118, 10.0963F, 1.9995F, -3.1715F, 6, 8, 7, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(10.8F, -16.2F, -1.6F);
		zhuan4.addChild(bone3);
		setRotationAngle(bone3, -1.4574F, 0.9797F, -1.1995F);
		

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(3.6F, 9.2F, -1.0F);
		bone3.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, -0.281F, -0.3497F, -0.2073F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 232, 0, 0.3548F, -11.6395F, -6.539F, 6, 11, 6, 0.0F, false));

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(8.0F, 7.0F, -1.0F);
		bone3.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, -1.2238F, -0.2129F, -0.3838F);
		LeftArm_r2.cubeList.add(new ModelBox(LeftArm_r2, 139, 15, -4.3262F, -0.6729F, -5.7182F, 6, 9, 6, 0.0F, false));

		hand13 = new ModelRenderer(this);
		hand13.setRotationPoint(10.0F, 6.0F, -10.7F);
		bone3.addChild(hand13);
		setRotationAngle(hand13, -1.155F, 0.1894F, -1.2153F);
		

		LeftArm_r3 = new ModelRenderer(this);
		LeftArm_r3.setRotationPoint(-9.0F, -7.0F, 3.5F);
		hand13.addChild(LeftArm_r3);
		setRotationAngle(LeftArm_r3, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r3.cubeList.add(new ModelBox(LeftArm_r3, 96, 58, 0.574F, 8.246F, -5.8842F, 8, 3, 10, 0.0F, false));

		LeftArm_r4 = new ModelRenderer(this);
		LeftArm_r4.setRotationPoint(-1.0F, -2.5F, 0.6F);
		hand13.addChild(LeftArm_r4);
		setRotationAngle(LeftArm_r4, -0.0503F, -0.5214F, -1.4701F);
		LeftArm_r4.cubeList.add(new ModelBox(LeftArm_r4, 150, 62, -4.5007F, -2.1617F, -3.9609F, 3, 9, 7, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-11.5F, -16.2F, -1.6F);
		zhuan4.addChild(bone4);
		setRotationAngle(bone4, -1.4574F, -0.9797F, 1.1995F);
		

		RightArm_r13 = new ModelRenderer(this);
		RightArm_r13.setRotationPoint(-3.6F, 9.2F, -1.0F);
		bone4.addChild(RightArm_r13);
		setRotationAngle(RightArm_r13, -0.215F, 0.3927F, 0.3889F);
		RightArm_r13.cubeList.add(new ModelBox(RightArm_r13, 232, 0, -6.3548F, -11.6395F, -6.539F, 6, 11, 6, 0.0F, false));

		RightArm_r14 = new ModelRenderer(this);
		RightArm_r14.setRotationPoint(-8.0F, 7.0F, -1.0F);
		bone4.addChild(RightArm_r14);
		setRotationAngle(RightArm_r14, -1.2238F, 0.2129F, 0.3838F);
		RightArm_r14.cubeList.add(new ModelBox(RightArm_r14, 138, 80, -1.6738F, -0.6729F, -5.7182F, 6, 9, 6, 0.0F, false));

		hand14 = new ModelRenderer(this);
		hand14.setRotationPoint(-10.0F, 6.0F, -10.7F);
		bone4.addChild(hand14);
		setRotationAngle(hand14, -1.155F, -0.1894F, 1.2153F);
		

		RightArm_r15 = new ModelRenderer(this);
		RightArm_r15.setRotationPoint(9.0F, -7.0F, 3.5F);
		hand14.addChild(RightArm_r15);
		setRotationAngle(RightArm_r15, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r15.cubeList.add(new ModelBox(RightArm_r15, 96, 105, -8.574F, 8.246F, -5.8842F, 8, 3, 10, 0.0F, false));

		RightArm_r16 = new ModelRenderer(this);
		RightArm_r16.setRotationPoint(1.0F, -2.5F, 0.6F);
		hand14.addChild(RightArm_r16);
		setRotationAngle(RightArm_r16, -0.0503F, 0.5214F, 1.4701F);
		RightArm_r16.cubeList.add(new ModelBox(RightArm_r16, 44, 148, 1.5007F, -2.1617F, -3.9609F, 3, 9, 7, 0.0F, false));

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(8.5F, -24.0F, -0.7F);
		zhuan4.addChild(leftarm4);
		setRotationAngle(leftarm4, -0.0366F, -0.0841F, -0.1201F);
		

		LeftArm_r5 = new ModelRenderer(this);
		LeftArm_r5.setRotationPoint(-0.5F, 2.0F, -2.0F);
		leftarm4.addChild(LeftArm_r5);
		setRotationAngle(LeftArm_r5, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r5.cubeList.add(new ModelBox(LeftArm_r5, 88, 39, 15.0F, -4.0F, -1.0F, 2, 5, 1, 0.0F, false));
		LeftArm_r5.cubeList.add(new ModelBox(LeftArm_r5, 0, 159, 12.0F, -2.0F, -2.0F, 3, 6, 3, 0.0F, false));
		LeftArm_r5.cubeList.add(new ModelBox(LeftArm_r5, 147, 122, 9.0F, 0.0F, -3.0F, 4, 6, 5, 0.0F, false));
		LeftArm_r5.cubeList.add(new ModelBox(LeftArm_r5, 86, 41, -0.3202F, -2.0158F, -5.5231F, 9, 9, 8, 0.0F, false));
		LeftArm_r5.cubeList.add(new ModelBox(LeftArm_r5, 0, 89, 1.0F, -4.0F, -4.0F, 9, 9, 8, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 4.0F, -5.6F);
		leftarm4.addChild(bone2);
		

		LeftArm_r6 = new ModelRenderer(this);
		LeftArm_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(LeftArm_r6);
		setRotationAngle(LeftArm_r6, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r6.cubeList.add(new ModelBox(LeftArm_r6, 0, 128, 1.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F, false));

		LeftArm_r7 = new ModelRenderer(this);
		LeftArm_r7.setRotationPoint(8.0F, 7.0F, -1.0F);
		bone2.addChild(LeftArm_r7);
		setRotationAngle(LeftArm_r7, -1.2238F, -0.2129F, -0.3838F);
		LeftArm_r7.cubeList.add(new ModelBox(LeftArm_r7, 96, 135, -3.4772F, -0.3283F, -5.634F, 6, 9, 6, 0.0F, false));

		hand12 = new ModelRenderer(this);
		hand12.setRotationPoint(10.0F, 6.0F, -11.5F);
		bone2.addChild(hand12);
		setRotationAngle(hand12, -0.7373F, 0.5033F, -0.8911F);
		

		LeftArm_r8 = new ModelRenderer(this);
		LeftArm_r8.setRotationPoint(-9.0F, -7.0F, 3.5F);
		hand12.addChild(LeftArm_r8);
		setRotationAngle(LeftArm_r8, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r8.cubeList.add(new ModelBox(LeftArm_r8, 94, 75, 0.0F, 8.0F, -5.0F, 8, 3, 10, 0.0F, false));

		LeftArm_r9 = new ModelRenderer(this);
		LeftArm_r9.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand12.addChild(LeftArm_r9);
		setRotationAngle(LeftArm_r9, -0.3109F, 0.2909F, 0.5451F);
		LeftArm_r9.cubeList.add(new ModelBox(LeftArm_r9, 120, 135, 5.9117F, 5.6207F, 3.1749F, 3, 6, 1, 0.0F, false));

		LeftArm_r10 = new ModelRenderer(this);
		LeftArm_r10.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand12.addChild(LeftArm_r10);
		setRotationAngle(LeftArm_r10, -0.3981F, 0.2909F, 0.5451F);
		LeftArm_r10.cubeList.add(new ModelBox(LeftArm_r10, 0, 89, 5.9117F, 5.3207F, 1.6749F, 3, 6, 1, 0.0F, false));

		LeftArm_r11 = new ModelRenderer(this);
		LeftArm_r11.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand12.addChild(LeftArm_r11);
		setRotationAngle(LeftArm_r11, -0.4418F, 0.2909F, 0.5451F);
		LeftArm_r11.cubeList.add(new ModelBox(LeftArm_r11, 12, 159, 5.9117F, 5.3207F, -0.1251F, 3, 6, 1, 0.0F, false));

		LeftArm_r12 = new ModelRenderer(this);
		LeftArm_r12.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand12.addChild(LeftArm_r12);
		setRotationAngle(LeftArm_r12, -0.5727F, 0.2909F, 0.5451F);
		LeftArm_r12.cubeList.add(new ModelBox(LeftArm_r12, 145, 62, 5.9117F, 5.3207F, -1.1251F, 3, 6, 1, 0.0F, false));

		LeftArm_r13 = new ModelRenderer(this);
		LeftArm_r13.setRotationPoint(-1.0F, -2.5F, 0.6F);
		hand12.addChild(LeftArm_r13);
		setRotationAngle(LeftArm_r13, -0.5727F, 0.2909F, 0.5451F);
		LeftArm_r13.cubeList.add(new ModelBox(LeftArm_r13, 26, 106, 2.9117F, 3.3207F, -4.1251F, 2, 5, 1, 0.0F, false));

		LeftArm_r14 = new ModelRenderer(this);
		LeftArm_r14.setRotationPoint(-1.0F, -2.5F, 0.6F);
		hand12.addChild(LeftArm_r14);
		setRotationAngle(LeftArm_r14, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r14.cubeList.add(new ModelBox(LeftArm_r14, 0, 143, -3.0963F, 1.9995F, -3.1715F, 4, 9, 7, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.0F, -1.0F, 17.4F);
		leftarm4.addChild(bone5);
		setRotationAngle(bone5, -1.4016F, 0.0523F, 0.5769F);
		

		hand15 = new ModelRenderer(this);
		hand15.setRotationPoint(10.0F, 6.0F, -11.5F);
		bone5.addChild(hand15);
		setRotationAngle(hand15, -0.7373F, 0.5033F, -0.8911F);
		

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-20.0F, -1.0F, 17.4F);
		leftarm4.addChild(bone10);
		setRotationAngle(bone10, -1.4016F, -0.0523F, -0.5769F);
		

		RightArm_r17 = new ModelRenderer(this);
		RightArm_r17.setRotationPoint(-5.3F, 6.1F, -0.7F);
		bone10.addChild(RightArm_r17);
		setRotationAngle(RightArm_r17, -0.3439F, -0.3284F, 2.6105F);
		RightArm_r17.cubeList.add(new ModelBox(RightArm_r17, 48, 133, -2.3115F, -8.8751F, -6.5F, 6, 9, 6, 0.0F, false));

		RightArm_r18 = new ModelRenderer(this);
		RightArm_r18.setRotationPoint(-5.3F, 6.1F, -1.7F);
		bone10.addChild(RightArm_r18);
		setRotationAngle(RightArm_r18, -1.0857F, -0.3284F, 2.6105F);
		RightArm_r18.cubeList.add(new ModelBox(RightArm_r18, 128, 127, -2.5228F, -0.3283F, -5.634F, 6, 9, 6, 0.0F, false));

		hand17 = new ModelRenderer(this);
		hand17.setRotationPoint(-10.0F, 6.0F, -11.5F);
		bone10.addChild(hand17);
		setRotationAngle(hand17, -0.7373F, -0.5033F, 0.8911F);
		

		RightArm_r19 = new ModelRenderer(this);
		RightArm_r19.setRotationPoint(9.0F, -7.0F, 3.5F);
		hand17.addChild(RightArm_r19);
		setRotationAngle(RightArm_r19, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r19.cubeList.add(new ModelBox(RightArm_r19, 84, 92, -8.0F, 8.0F, -5.0F, 8, 3, 10, 0.0F, false));

		RightArm_r20 = new ModelRenderer(this);
		RightArm_r20.setRotationPoint(1.0F, -2.5F, -0.4F);
		hand17.addChild(RightArm_r20);
		setRotationAngle(RightArm_r20, -0.3109F, -0.2909F, -0.5451F);
		RightArm_r20.cubeList.add(new ModelBox(RightArm_r20, 120, 0, -8.9117F, 5.6207F, 3.1749F, 3, 6, 1, 0.0F, false));

		RightArm_r21 = new ModelRenderer(this);
		RightArm_r21.setRotationPoint(1.0F, -2.5F, -0.4F);
		hand17.addChild(RightArm_r21);
		setRotationAngle(RightArm_r21, -0.3981F, -0.2909F, -0.5451F);
		RightArm_r21.cubeList.add(new ModelBox(RightArm_r21, 82, 0, -8.9117F, 5.3207F, 1.6749F, 3, 6, 1, 0.0F, false));

		RightArm_r22 = new ModelRenderer(this);
		RightArm_r22.setRotationPoint(1.0F, -2.5F, -0.4F);
		hand17.addChild(RightArm_r22);
		setRotationAngle(RightArm_r22, -0.4418F, -0.2909F, -0.5451F);
		RightArm_r22.cubeList.add(new ModelBox(RightArm_r22, 155, 30, -8.9117F, 5.3207F, -0.1251F, 3, 6, 1, 0.0F, false));

		RightArm_r23 = new ModelRenderer(this);
		RightArm_r23.setRotationPoint(1.0F, -2.5F, -0.4F);
		hand17.addChild(RightArm_r23);
		setRotationAngle(RightArm_r23, -0.5727F, -0.2909F, -0.5451F);
		RightArm_r23.cubeList.add(new ModelBox(RightArm_r23, 135, 142, -8.9117F, 5.3207F, -1.1251F, 3, 6, 1, 0.0F, false));

		RightArm_r24 = new ModelRenderer(this);
		RightArm_r24.setRotationPoint(1.0F, -2.5F, 0.6F);
		hand17.addChild(RightArm_r24);
		setRotationAngle(RightArm_r24, -0.5727F, -0.2909F, -0.5451F);
		RightArm_r24.cubeList.add(new ModelBox(RightArm_r24, 100, 58, -4.9117F, 3.3207F, -4.1251F, 2, 5, 1, 0.0F, false));

		RightArm_r25 = new ModelRenderer(this);
		RightArm_r25.setRotationPoint(1.0F, -2.5F, 0.6F);
		hand17.addChild(RightArm_r25);
		setRotationAngle(RightArm_r25, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r25.cubeList.add(new ModelBox(RightArm_r25, 120, 142, -0.9037F, 1.9995F, -3.1715F, 4, 9, 7, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.0F, -1.0F, 17.4F);
		leftarm4.addChild(bone6);
		setRotationAngle(bone6, -1.4016F, 0.0523F, 0.5769F);
		

		LeftArm_r15 = new ModelRenderer(this);
		LeftArm_r15.setRotationPoint(5.3F, 6.1F, -0.7F);
		bone6.addChild(LeftArm_r15);
		setRotationAngle(LeftArm_r15, -0.3439F, 0.3284F, -2.6105F);
		LeftArm_r15.cubeList.add(new ModelBox(LeftArm_r15, 24, 132, -3.6885F, -8.8751F, -6.5F, 6, 9, 6, 0.0F, false));

		LeftArm_r16 = new ModelRenderer(this);
		LeftArm_r16.setRotationPoint(5.3F, 6.1F, -1.7F);
		bone6.addChild(LeftArm_r16);
		setRotationAngle(LeftArm_r16, -1.0857F, 0.3284F, -2.6105F);
		LeftArm_r16.cubeList.add(new ModelBox(LeftArm_r16, 128, 112, -3.4772F, -0.3283F, -5.634F, 6, 9, 6, 0.0F, false));

		hand16 = new ModelRenderer(this);
		hand16.setRotationPoint(10.0F, 6.0F, -11.5F);
		bone6.addChild(hand16);
		setRotationAngle(hand16, -0.7373F, 0.5033F, -0.8911F);
		

		LeftArm_r17 = new ModelRenderer(this);
		LeftArm_r17.setRotationPoint(-9.0F, -7.0F, 3.5F);
		hand16.addChild(LeftArm_r17);
		setRotationAngle(LeftArm_r17, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r17.cubeList.add(new ModelBox(LeftArm_r17, 82, 3, 0.0F, 8.0F, -5.0F, 8, 3, 10, 0.0F, false));

		LeftArm_r18 = new ModelRenderer(this);
		LeftArm_r18.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand16.addChild(LeftArm_r18);
		setRotationAngle(LeftArm_r18, -0.3109F, 0.2909F, 0.5451F);
		LeftArm_r18.cubeList.add(new ModelBox(LeftArm_r18, 34, 93, 5.9117F, 5.6207F, 3.1749F, 3, 6, 1, 0.0F, false));

		LeftArm_r19 = new ModelRenderer(this);
		LeftArm_r19.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand16.addChild(LeftArm_r19);
		setRotationAngle(LeftArm_r19, -0.3981F, 0.2909F, 0.5451F);
		LeftArm_r19.cubeList.add(new ModelBox(LeftArm_r19, 78, 49, 5.9117F, 5.3207F, 1.6749F, 3, 6, 1, 0.0F, false));

		LeftArm_r20 = new ModelRenderer(this);
		LeftArm_r20.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand16.addChild(LeftArm_r20);
		setRotationAngle(LeftArm_r20, -0.4418F, 0.2909F, 0.5451F);
		LeftArm_r20.cubeList.add(new ModelBox(LeftArm_r20, 37, 147, 5.9117F, 5.3207F, -0.1251F, 3, 6, 1, 0.0F, false));

		LeftArm_r21 = new ModelRenderer(this);
		LeftArm_r21.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand16.addChild(LeftArm_r21);
		setRotationAngle(LeftArm_r21, -0.5727F, 0.2909F, 0.5451F);
		LeftArm_r21.cubeList.add(new ModelBox(LeftArm_r21, 140, 46, 5.9117F, 5.3207F, -1.1251F, 3, 6, 1, 0.0F, false));

		LeftArm_r22 = new ModelRenderer(this);
		LeftArm_r22.setRotationPoint(-1.0F, -2.5F, 0.6F);
		hand16.addChild(LeftArm_r22);
		setRotationAngle(LeftArm_r22, -0.5727F, 0.2909F, 0.5451F);
		LeftArm_r22.cubeList.add(new ModelBox(LeftArm_r22, 100, 58, 2.9117F, 3.3207F, -4.1251F, 2, 5, 1, 0.0F, false));

		LeftArm_r23 = new ModelRenderer(this);
		LeftArm_r23.setRotationPoint(-1.0F, -2.5F, 0.6F);
		hand16.addChild(LeftArm_r23);
		setRotationAngle(LeftArm_r23, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r23.cubeList.add(new ModelBox(LeftArm_r23, 140, 30, -3.0963F, 1.9995F, -3.1715F, 4, 9, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		zhuan4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}