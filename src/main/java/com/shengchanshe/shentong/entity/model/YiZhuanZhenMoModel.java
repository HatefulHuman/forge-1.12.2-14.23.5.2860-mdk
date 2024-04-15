package com.shengchanshe.shentong.entity.model;
// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class YiZhuanZhenMoModel extends ModelBase {
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
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Head_r5;
	private final ModelRenderer body4;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Body_r5;
	private final ModelRenderer Body_r6;
	private final ModelRenderer leftarm4;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer LeftArm_r3;
	private final ModelRenderer hand12;
	private final ModelRenderer LeftArm_r4;
	private final ModelRenderer LeftArm_r5;
	private final ModelRenderer LeftArm_r6;
	private final ModelRenderer LeftArm_r7;
	private final ModelRenderer LeftArm_r8;
	private final ModelRenderer LeftArm_r9;
	private final ModelRenderer LeftArm_r10;
	private final ModelRenderer bone5;
	private final ModelRenderer hand15;
	private final ModelRenderer rightarm4;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer RightArm_r3;
	private final ModelRenderer hand2;
	private final ModelRenderer RightArm_r4;
	private final ModelRenderer RightArm_r5;
	private final ModelRenderer RightArm_r6;
	private final ModelRenderer RightArm_r7;
	private final ModelRenderer RightArm_r8;
	private final ModelRenderer RightArm_r9;
	private final ModelRenderer RightArm_r10;
	private final ModelRenderer bone4;
	private final ModelRenderer hand3;

	public YiZhuanZhenMoModel() {
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
		

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-2.0F, -14.0F, 0.0F);
		bone19.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.0F, 1.0472F);
		

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(2.0F, -14.0F, 0.0F);
		bone19.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -1.0472F);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(2.0F, -18.0F, -20.8F);
		hand10.addChild(bone23);
		

		Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(-4.0F, 0.0F, -2.0F);
		bone23.addChild(Head_r4);
		setRotationAngle(Head_r4, -1.5708F, -1.0036F, 1.309F);
		Head_r4.cubeList.add(new ModelBox(Head_r4, 156, 78, 0.9473F, -7.217F, 1.0F, 3, 5, 3, 0.0F, false));

		Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(0.0F, 0.0F, -2.0F);
		bone23.addChild(Head_r5);
		setRotationAngle(Head_r5, -1.5708F, 1.0036F, -1.309F);
		Head_r5.cubeList.add(new ModelBox(Head_r5, 156, 78, -3.9473F, -7.217F, 1.0F, 3, 5, 3, 0.0F, false));

		body4 = new ModelRenderer(this);
		body4.setRotationPoint(0.0F, -14.0F, 16.0F);
		zhuan4.addChild(body4);
		body4.cubeList.add(new ModelBox(body4, 0, 21, -7.0F, -13.0F, -23.5F, 14, 8, 11, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 45, 0, -7.0F, -5.0F, -22.0F, 14, 4, 9, 0.0F, false));

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 6.0F, 0.0F);
		body4.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.2182F, 0.0F, 0.0F);
		Body_r1.cubeList.add(new ModelBox(Body_r1, 220, 25, -5.0F, -4.0F, -23.0F, 10, 6, 8, 0.0F, false));

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

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(8.5F, -24.0F, -0.7F);
		zhuan4.addChild(leftarm4);
		setRotationAngle(leftarm4, -0.0366F, -0.0841F, -0.1201F);
		

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-0.5F, 2.0F, -2.0F);
		leftarm4.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 88, 39, 15.0F, -4.0F, -1.0F, 2, 5, 1, 0.0F, false));
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 0, 159, 12.0F, -2.0F, -2.0F, 3, 6, 3, 0.0F, false));
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 147, 122, 9.0F, 0.0F, -3.0F, 4, 6, 5, 0.0F, false));
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 86, 41, -0.3202F, -2.0158F, -5.5231F, 9, 9, 8, 0.0F, false));
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 0, 89, 1.0F, -4.0F, -4.0F, 9, 9, 8, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 4.0F, -5.6F);
		leftarm4.addChild(bone2);
		

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r2.cubeList.add(new ModelBox(LeftArm_r2, 0, 128, 1.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F, false));

		LeftArm_r3 = new ModelRenderer(this);
		LeftArm_r3.setRotationPoint(8.0F, 7.0F, -1.0F);
		bone2.addChild(LeftArm_r3);
		setRotationAngle(LeftArm_r3, -1.2238F, -0.2129F, -0.3838F);
		LeftArm_r3.cubeList.add(new ModelBox(LeftArm_r3, 96, 135, -3.4772F, -0.3283F, -5.634F, 6, 9, 6, 0.0F, false));

		hand12 = new ModelRenderer(this);
		hand12.setRotationPoint(10.0F, 6.0F, -11.5F);
		bone2.addChild(hand12);
		setRotationAngle(hand12, -0.7373F, 0.5033F, -0.8911F);
		

		LeftArm_r4 = new ModelRenderer(this);
		LeftArm_r4.setRotationPoint(-9.0F, -7.0F, 3.5F);
		hand12.addChild(LeftArm_r4);
		setRotationAngle(LeftArm_r4, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r4.cubeList.add(new ModelBox(LeftArm_r4, 94, 75, 0.0F, 8.0F, -5.0F, 8, 3, 10, 0.0F, false));

		LeftArm_r5 = new ModelRenderer(this);
		LeftArm_r5.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand12.addChild(LeftArm_r5);
		setRotationAngle(LeftArm_r5, -0.3109F, 0.2909F, 0.5451F);
		LeftArm_r5.cubeList.add(new ModelBox(LeftArm_r5, 120, 135, 5.9117F, 5.6207F, 3.1749F, 3, 6, 1, 0.0F, false));

		LeftArm_r6 = new ModelRenderer(this);
		LeftArm_r6.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand12.addChild(LeftArm_r6);
		setRotationAngle(LeftArm_r6, -0.3981F, 0.2909F, 0.5451F);
		LeftArm_r6.cubeList.add(new ModelBox(LeftArm_r6, 0, 89, 5.9117F, 5.3207F, 1.6749F, 3, 6, 1, 0.0F, false));

		LeftArm_r7 = new ModelRenderer(this);
		LeftArm_r7.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand12.addChild(LeftArm_r7);
		setRotationAngle(LeftArm_r7, -0.4418F, 0.2909F, 0.5451F);
		LeftArm_r7.cubeList.add(new ModelBox(LeftArm_r7, 12, 159, 5.9117F, 5.3207F, -0.1251F, 3, 6, 1, 0.0F, false));

		LeftArm_r8 = new ModelRenderer(this);
		LeftArm_r8.setRotationPoint(-1.0F, -2.5F, -0.4F);
		hand12.addChild(LeftArm_r8);
		setRotationAngle(LeftArm_r8, -0.5727F, 0.2909F, 0.5451F);
		LeftArm_r8.cubeList.add(new ModelBox(LeftArm_r8, 145, 62, 5.9117F, 5.3207F, -1.1251F, 3, 6, 1, 0.0F, false));

		LeftArm_r9 = new ModelRenderer(this);
		LeftArm_r9.setRotationPoint(-1.0F, -2.5F, 0.6F);
		hand12.addChild(LeftArm_r9);
		setRotationAngle(LeftArm_r9, -0.5727F, 0.2909F, 0.5451F);
		LeftArm_r9.cubeList.add(new ModelBox(LeftArm_r9, 26, 106, 2.9117F, 3.3207F, -4.1251F, 2, 5, 1, 0.0F, false));

		LeftArm_r10 = new ModelRenderer(this);
		LeftArm_r10.setRotationPoint(-1.0F, -2.5F, 0.6F);
		hand12.addChild(LeftArm_r10);
		setRotationAngle(LeftArm_r10, -0.4821F, -0.2129F, -0.3838F);
		LeftArm_r10.cubeList.add(new ModelBox(LeftArm_r10, 0, 143, -3.0963F, 1.9995F, -3.1715F, 4, 9, 7, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.0F, -1.0F, 17.4F);
		leftarm4.addChild(bone5);
		setRotationAngle(bone5, -1.4016F, 0.0523F, 0.5769F);
		

		hand15 = new ModelRenderer(this);
		hand15.setRotationPoint(10.0F, 6.0F, -11.5F);
		bone5.addChild(hand15);
		setRotationAngle(hand15, -0.7373F, 0.5033F, -0.8911F);
		

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(-8.5F, -24.0F, -0.7F);
		zhuan4.addChild(rightarm4);
		setRotationAngle(rightarm4, -0.0366F, 0.0841F, 0.1201F);
		

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(0.5F, 2.0F, -2.0F);
		rightarm4.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 88, 39, -17.0F, -4.0F, -1.0F, 2, 5, 1, 0.0F, true));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 0, 159, -15.0F, -2.0F, -2.0F, 3, 6, 3, 0.0F, true));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 147, 122, -13.0F, 0.0F, -3.0F, 4, 6, 5, 0.0F, true));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 86, 41, -8.6798F, -2.0158F, -5.5231F, 9, 9, 8, 0.0F, true));
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 0, 89, -10.0F, -4.0F, -4.0F, 9, 9, 8, 0.0F, true));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.0F, 4.0F, -5.6F);
		rightarm4.addChild(bone3);
		

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 0, 128, -7.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F, true));

		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setRotationPoint(-8.0F, 7.0F, -1.0F);
		bone3.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, -1.2238F, 0.2129F, 0.3838F);
		RightArm_r3.cubeList.add(new ModelBox(RightArm_r3, 96, 135, -2.5228F, -0.3283F, -5.634F, 6, 9, 6, 0.0F, true));

		hand2 = new ModelRenderer(this);
		hand2.setRotationPoint(-10.0F, 6.0F, -11.5F);
		bone3.addChild(hand2);
		setRotationAngle(hand2, -0.7373F, -0.5033F, 0.8911F);
		

		RightArm_r4 = new ModelRenderer(this);
		RightArm_r4.setRotationPoint(9.0F, -7.0F, 3.5F);
		hand2.addChild(RightArm_r4);
		setRotationAngle(RightArm_r4, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r4.cubeList.add(new ModelBox(RightArm_r4, 94, 75, -8.0F, 8.0F, -5.0F, 8, 3, 10, 0.0F, true));

		RightArm_r5 = new ModelRenderer(this);
		RightArm_r5.setRotationPoint(1.0F, -2.5F, -0.4F);
		hand2.addChild(RightArm_r5);
		setRotationAngle(RightArm_r5, -0.3109F, -0.2909F, -0.5451F);
		RightArm_r5.cubeList.add(new ModelBox(RightArm_r5, 120, 135, -8.9117F, 5.6207F, 3.1749F, 3, 6, 1, 0.0F, true));

		RightArm_r6 = new ModelRenderer(this);
		RightArm_r6.setRotationPoint(1.0F, -2.5F, -0.4F);
		hand2.addChild(RightArm_r6);
		setRotationAngle(RightArm_r6, -0.3981F, -0.2909F, -0.5451F);
		RightArm_r6.cubeList.add(new ModelBox(RightArm_r6, 0, 89, -8.9117F, 5.3207F, 1.6749F, 3, 6, 1, 0.0F, true));

		RightArm_r7 = new ModelRenderer(this);
		RightArm_r7.setRotationPoint(1.0F, -2.5F, -0.4F);
		hand2.addChild(RightArm_r7);
		setRotationAngle(RightArm_r7, -0.4418F, -0.2909F, -0.5451F);
		RightArm_r7.cubeList.add(new ModelBox(RightArm_r7, 12, 159, -8.9117F, 5.3207F, -0.1251F, 3, 6, 1, 0.0F, true));

		RightArm_r8 = new ModelRenderer(this);
		RightArm_r8.setRotationPoint(1.0F, -2.5F, -0.4F);
		hand2.addChild(RightArm_r8);
		setRotationAngle(RightArm_r8, -0.5727F, -0.2909F, -0.5451F);
		RightArm_r8.cubeList.add(new ModelBox(RightArm_r8, 145, 62, -8.9117F, 5.3207F, -1.1251F, 3, 6, 1, 0.0F, true));

		RightArm_r9 = new ModelRenderer(this);
		RightArm_r9.setRotationPoint(1.0F, -2.5F, 0.6F);
		hand2.addChild(RightArm_r9);
		setRotationAngle(RightArm_r9, -0.5727F, -0.2909F, -0.5451F);
		RightArm_r9.cubeList.add(new ModelBox(RightArm_r9, 26, 106, -4.9117F, 3.3207F, -4.1251F, 2, 5, 1, 0.0F, true));

		RightArm_r10 = new ModelRenderer(this);
		RightArm_r10.setRotationPoint(1.0F, -2.5F, 0.6F);
		hand2.addChild(RightArm_r10);
		setRotationAngle(RightArm_r10, -0.4821F, 0.2129F, 0.3838F);
		RightArm_r10.cubeList.add(new ModelBox(RightArm_r10, 0, 143, -0.9037F, 1.9995F, -3.1715F, 4, 9, 7, 0.0F, true));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.0F, -1.0F, 17.4F);
		rightarm4.addChild(bone4);
		setRotationAngle(bone4, -1.4016F, -0.0523F, -0.5769F);
		

		hand3 = new ModelRenderer(this);
		hand3.setRotationPoint(-10.0F, 6.0F, -11.5F);
		bone4.addChild(hand3);
		setRotationAngle(hand3, -0.7373F, -0.5033F, 0.8911F);
		
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