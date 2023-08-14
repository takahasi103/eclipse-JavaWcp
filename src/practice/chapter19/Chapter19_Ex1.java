package practice.chapter19;

import java.io.FileWriter;
import java.io.IOException;

public class Chapter19_Ex1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Applications/Eclipse_2021-12.app/Contents/workspace/input.csv", true);
			fw.write("名前,ふりがな,アドレス,性別,年齢,都道府県,電話番号\n"
					+ "野本 恵美,のもと めぐみ,nomoto_megumi@example.com,女,77,北海道,026-619-7317\n"
					+ "川端 悟志,かわばた さとし,kawabata_satoshi@example.com,男,29,宮城県,087-644-4834\n"
					+ "海野 寿明,うみの としあき,umino_toshiaki@example.com,男,33,茨城県,056-915-4362\n"
					+ "六角 薫,ろっかく かおる,rokkaku_kaoru@example.com,女,21,神奈川県,046-919- 965\n"
					+ "金城 那奈,かなしろ なな,kanashiro_nana@example.com,女,79,兵庫県,053-959-9914\n"
					+ "平井 貴美子,ひらい きみこ,hirai_kimiko@example.com,女,36,宮崎県,024-965-8684\n"
					+ "玉田 季衣,たまだ としえ,tamada_toshie@example.com,女,55,香川県,069-395-2716\n"
					+ "今 ひろ子,いま ひろこ,ima_hiroko@example.com,女,44,埼玉県,086-619-3584\n"
					+ "寺田 里穂,てらだ りほ,terada_riho@example.com,女,23,東京都,077-232-5413\n"
					+ "小野寺 沙知絵,おのでら さちえ,onodera_sachie@example.com,女,28,神奈川県,090-685-5312");
		} catch (IOException e) {
			System.out.println("エラーです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
