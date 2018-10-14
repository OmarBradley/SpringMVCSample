package com.omarbradley.oemssample.movie.ibsheetjson;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.omarbradley.oemssample.cmmn.ibsheet.Cfg;
import com.omarbradley.oemssample.cmmn.ibsheet.Col;
import com.omarbradley.oemssample.cmmn.ibsheet.HeaderMode;
import com.omarbradley.oemssample.cmmn.ibsheet.SheetConfigData;
import com.omarbradley.oemssample.cmmn.util.JsonParserUtil;

public class MovieIbSheetJson {

	@Resource(name = "jsonParserUtil")
	private JsonParserUtil jsonParserUtil;


	public String createAllMovieSheetJson() {
		Cfg cfg = new Cfg();
		cfg.SearchMode = 2;
		cfg.Page = 10;
		cfg.FrozenCol = 0;
		cfg.UseHeaderActionMenu = false;
		cfg.MouseHoverMode = 0;
		cfg.SelectionRowsMode = 1;
		cfg.AutoFitColWidth = "resize";
		cfg.DeferredVScroll = 1;

		HeaderMode headerMode = new HeaderMode();
		headerMode.Sort = 0;
		headerMode.ColMove = 0;
		headerMode.ColResize = 0;
		headerMode.HeaderCheck = 0;

		Col movieIdCol = new Col();
		movieIdCol.Header = "영화 id";
		movieIdCol.Type = "Int";
		movieIdCol.Width = 50;
		movieIdCol.SaveName = "id";
		movieIdCol.Align = "Right";

		Col movieTitleCol = new Col();
		movieTitleCol.Header = "영화명";
		movieTitleCol.Type = "Text";
		movieTitleCol.Width = 200;
		movieTitleCol.SaveName = "title";
		movieTitleCol.Ellipsis = 1;

		Col movieCountCol = new Col();
		movieCountCol.Header = "상영횟수";
		movieCountCol.Type = "AutoSum";
		movieCountCol.Width = 100;
		movieCountCol.SaveName = "count";
		movieCountCol.Format = "#,##0";

		Col movieNationCol = new Col();
		movieNationCol.Header = "국가";
		movieNationCol.Type = "Combo";
		movieNationCol.Width = 70;
		movieNationCol.SaveName = "sNation";
		movieNationCol.ComboText = "한국|미국|일본|영국|캐나다|이탈리아|스웨덴|중국|프랑스";
		movieNationCol.Align = "Center";
		movieNationCol.ShowMobile = 0;

		List<Col> Cols = new ArrayList<>();
		Cols.add(movieIdCol);
		Cols.add(movieTitleCol);
		Cols.add(movieCountCol);
		Cols.add(movieNationCol);

		SheetConfigData configData = new SheetConfigData();
		configData.Cfg = cfg;
		configData.HeaderMode = headerMode;
		configData.Cols = Cols;

		return jsonParserUtil.convertJson(configData);
	}
	
}