package wwiiunits.main;

import java.util.ArrayList;
import java.util.List;

import wwiiunits.planes.bombers.Lancaster;
import wwiiunits.planes.fighters.BF109;
import wwiiunits.planes.fighters.P39;
import wwiiunits.planes.fighters.P51;
import wwiiunits.planes.fighters.Spitfire;
import wwiiunits.planes.fighters.Yakovlev;
import wwiiunits.planes.fighters.Zero;
import wwiiunits.ships.battleships.Borodino;
import wwiiunits.ships.battleships.Illinois;
import wwiiunits.ships.battleships.Schamhorst;
import wwiiunits.ships.carriers.GrafZeppelin;
import wwiiunits.ships.carriers.Implacable;
import wwiiunits.ships.carriers.Midway;
import wwiiunits.ships.carriers.Taiho;
import wwiiunits.ships.destroyers.Fletcher;
import wwiiunits.ships.destroyers.Gnevny;
import wwiiunits.ships.destroyers.JKN;
import wwiiunits.ships.destroyers.Shimakaze;
import wwiiunits.ships.destroyers.Zerstorer;
import wwiiunits.tanks.heavy.Churchill;
import wwiiunits.tanks.heavy.KV1;
import wwiiunits.tanks.heavy.PanzerVI;
import wwiiunits.tanks.light.Valentine;
import wwiiunits.tanks.medium.Crusader;
import wwiiunits.tanks.medium.M4Sherman;
import wwiiunits.tanks.medium.PanzerIV;
import wwiiunits.tanks.medium.T34;
import wwiiunits.tanks.medium.Type97;

public class Main
{
	public static List<Unit> americanUnits = new ArrayList<Unit>();
	public static List<Unit> britishUnits = new ArrayList<Unit>();
	public static List<Unit> sovietUnits = new ArrayList<Unit>();
	public static List<Unit> germanUnits = new ArrayList<Unit>();
	public static List<Unit> japaneseUnits = new ArrayList<Unit>();

	public static void main(String[] args)
	{
		createUnits();
		printUnitDetails();
	}

	public static void printUnitDetails()
	{		
		for(Unit u : americanUnits)
		{
			System.out.println(u.toString() + "\n");
		}

		for(Unit u : britishUnits)
		{
			System.out.println(u.toString() + "\n");
		}

		for(Unit u : sovietUnits)
		{
			System.out.println(u.toString() + "\n");
		}

		for(Unit u : germanUnits)
		{
			System.out.println(u.toString() + "\n");
		}

		for(Unit u : japaneseUnits)
		{
			System.out.println(u.toString() + "\n");
		}
	}

	public static void createUnits()
	{
		/**
		 * American Tanks
		 */
		Unit m4Sherman = new M4Sherman();
		americanUnits.add(m4Sherman);

		/**
		 * American Planes
		 */
		Unit p39 = new P39();
		Unit p51 = new P51();

		americanUnits.add(p39);
		americanUnits.add(p51);

		/**
		 * American Ships
		 */
		Unit fletcher = new Fletcher();
		Unit illinois = new Illinois();
		Unit midway = new Midway();

		americanUnits.add(fletcher);
		americanUnits.add(illinois);
		americanUnits.add(midway);

		/**
		 * British Tanks
		 */
		Unit valentine = new Valentine();
		Unit crusader = new Crusader();
		Unit churchill = new Churchill();

		britishUnits.add(valentine);
		britishUnits.add(crusader);
		britishUnits.add(churchill);

		/**
		 * British Planes
		 */
		Unit spitfire = new Spitfire();
		Unit lancaster = new Lancaster();

		britishUnits.add(spitfire);
		britishUnits.add(lancaster);

		/**
		 * British Ships
		 */
		Unit jkn = new JKN();
		Unit implacable = new Implacable();

		britishUnits.add(jkn);
		britishUnits.add(implacable);

		/**
		 * Soviet Tanks
		 */
		Unit t34 = new T34();
		Unit kv1 = new KV1();

		sovietUnits.add(t34);
		sovietUnits.add(kv1);

		/**
		 * Soviet Planes
		 */
		Unit yakovlev = new Yakovlev();
		sovietUnits.add(yakovlev);

		/**
		 * Soviet Ships
		 */
		Unit gnevny = new Gnevny();
		Unit borodinoUSSR = new Borodino("USSR");

		sovietUnits.add(gnevny);
		sovietUnits.add(borodinoUSSR);

		/**
		 * German Tanks
		 */
		Unit panzerIV = new PanzerIV();
		Unit panzerVI = new PanzerVI();

		germanUnits.add(panzerIV);
		germanUnits.add(panzerVI);

		/**
		 * German Planes
		 */
		Unit bf109 = new BF109();
		germanUnits.add(bf109);

		/**
		 * German Ships
		 */
		Unit zerstorer = new Zerstorer();
		Unit schamhorst = new Schamhorst();
		Unit grafZeppelin = new GrafZeppelin();

		germanUnits.add(zerstorer);
		germanUnits.add(schamhorst);
		germanUnits.add(grafZeppelin);

		/**
		 * Japanese Tanks
		 */
		Unit type97 = new Type97();
		japaneseUnits.add(type97);

		/**
		 * Japanese Planes
		 */
		Unit zero = new Zero();
		japaneseUnits.add(zero);

		/**
		 * Japanese Ships
		 */
		Unit shimakaze = new Shimakaze();
		Unit borodinoJapan = new Borodino("Japan");
		Unit Taiho = new Taiho();

		japaneseUnits.add(shimakaze);
		japaneseUnits.add(borodinoJapan);
		japaneseUnits.add(Taiho);
	}
}
